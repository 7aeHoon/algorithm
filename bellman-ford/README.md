## 벨만-포드 알고리즘 (Bellman-Ford Algorithm)
> 그래프 상에서 하나의 시작 정점으로부터 다른 모든 정점까지의 최단 경로를 구하는 최단 경로 알고리즘입니다.

![벨만포드 구조](https://static.wikidocs.net/images/page/206946/Screenshot_at_Dec_25_17-19-13.png)

### 1. 전제 조건
- `음수 가중치`를 가진 간선이 존재해도 올바른 `최단 경로`를 찾을 수 있습니다.(반드시 음수 가중치가 나온다는 말은 아닙니다.)
- 그래프 내에 `음수 사이클(Negative Cycle)`이 존재하는지 여부를 완벽하게 감지할 수 있습니다.
- 단, 다익스트라(Dijkstra) 알고리즘에 비해 속도가 느리므로, 음수 간선이 없을 때는 다익스트라를 사용하는 것이 효율적입니다.

### 2. 작동 원리
1. **초기화**: 출발 정점의 거리는 `0`, 나머지 모든 정점의 거리는 무한대(`INF`)로 설정합니다.
2. **간선 완화(Relaxation) 반복**: 그래프의 정점 개수가 $V$개일 때, **모든 간선 $E$개에 대한 완화 작업을 $V-1$번 반복**합니다.
   - 완화 조건: `dist[curr] + weight < dist[next]` 이라면 최단 거리를 갱신합니다.
3. **음수 사이클 감지**: $V-1$번의 완화 작업을 모두 마친 후, **마지막으로 모든 간선에 대해 완화 작업을 한 번 더 수행**합니다. 이때 만약 값이 또 갱신되는 정점이 있다면, 그 그래프는 음수 사이클이 존재하는 그래프입니다.

### 3. 시간 복잡도
- **$O(V \times E)$**
  - $V$번의 루프 동안 매번 $E$개의 간선을 모두 확인하므로, 최악의 경우 정점과 간선의 곱만큼 시간이 걸립니다.

### 4. 구현 코드 (C++)

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// 충분히 큰 값 설정 (오버플로우 방지를 위해 정적 타겟에 맞춰 선택)
const long long INF = 1e18;

// 간선 정보를 저장할 구조체
struct Edge {
    int from;
    int to;
    int weight;
};

/**
 * 벨만-포드 알고리즘
 * @param start 시작 정점
 * @param V 정점의 개수
 * @param edges 간선 리스트
 * @param dist 최단 거리를 기록할 배열
 * @return 음수 사이클 존재 여부 (true: 안전 / false: 음수 사이클 존재)
 */
bool bellmanFord(int start, int V, const vector<Edge>& edges, vector<long long>& dist) {
    // 1. 초기화
    dist.assign(V + 1, INF);
    dist[start] = 0;

    // 2. V-1번 정점 완화 반복
    for (int i = 1; i <= V - 1; i++) {
        for (const auto& edge : edges) {
            // 아직 출발지로부터 도달할 수 없는 정점은 건너뜀
            if (dist[edge.from] == INF) continue;

            // 더 짧은 경로를 발견하면 갱신
            if (dist[edge.to] > dist[edge.from] + edge.weight) {
                dist[edge.to] = dist[edge.from] + edge.weight;
            }
        }
    }

    // 3. 음수 사이클 유무 확인 (V번째 완화 시도)
    for (const auto& edge : edges) {
        if (dist[edge.from] == INF) continue;

        // V-1번을 돌린 후에도 값이 또 갱신된다면 음수 사이클이 있는 것임
        if (dist[edge.to] > dist[edge.from] + edge.weight) {
            return false; // 음수 사이클 존재
        }
    }

    return true; // 정상 종료
}
