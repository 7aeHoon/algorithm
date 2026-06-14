## 위상 정렬 (Topological Sort)
> 방향성이 있고 사이클이 없는 그래프(DAG, Directed Acyclic Graph)의 모든 정점을 주어진 방향성을 거스르지 않도록 순서대로 나열하는 알고리즘입니다.
> 주로 '선행 과목', '작업의 순서' 등이 주어질 때 정렬을 위해 사용됩니다.

![위상 정렬 예시](https://static.wikidocs.net/images/page/206817/Screenshot_at_Jul_12_00-05-13.png)

### 1. 전제 조건
- `방향성이 있어야` 합니다 (Directed).
- `사이클(Cycle)이 없어야` 합니다 (Acyclic).
- `진입 차수(Indegree)가 필요`합니다.
  - 한 정점으로 들어오는 간선의 개수를 뜻하며, 위상 정렬의 핵심 데이터로 사용됩니다.

### 2. 작동 원리 (Queue 활용 방식)
1. **초기화**: 모든 정점의 진입 차수(Indegree)를 계산하고, `진입 차수가 0인 모든 정점`을 큐(Queue)에 삽입합니다.
2. **반복 작업**: 큐가 빌 때까지 아래 작업을 반복합니다.
   - 큐에서 원소를 꺼내 정렬 결과 리스트에 담습니다.
   - 꺼낸 정점과 연결된 모든 간선을 그래프에서 제거합니다. (이때 제거의 의미는 연결된 인접 정점들의 진입 차수를 1씩 감소입니다.)
   - 이때 `진입 차수가 새롭게 0이 된 정점`이 있다면 큐에 삽입합니다.
3. **사이클 판별**: 큐가 비어서 종료되었을 때, 정렬된 정점의 개수가 전체 정점의 개수($V$)보다 적다면 그래프에 `사이클이 존재`하는 것으로 판단합니다. (모든 정점을 방문하기 전에 큐가 먼저 비어있는 상태)

### 3. 시간 복잡도
- **$O(V + E)$**
  - $V$: 정점의 개수, $E$: 간선의 개수
  - 모든 정점을 한 번씩 큐에 넣고 빼며($V$), 각 정점에서 나가는 모든 간선을 한 번씩 확인($E$)하므로 선형 시간에 동작합니다.

### 4. 구현 코드 (C++)
```cpp
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

/**
 * 위상 정렬 알고리즘
 * @param V 정점의 개수
 * @param adj 인접 리스트 형식의 그래프
 * @param indegree 각 정점의 진입 차수 배열
 * @return 정렬된 결과 벡터 (사이클 존재 시 빈 벡터 반환)
 */
vector<int> topologicalSort(int V, const vector<vector<int>>& adj, vector<int>& indegree) {
    vector<int> result;
    queue<int> q;

    // 1. 진입 차수가 0인 정점을 큐에 모두 삽입
    for (int i = 1; i <= V; i++) {
        if (indegree[i] == 0) {
            q.push(i);
        }
    }

    // 2. 큐가 빌 때까지 반복
    while (!q.empty()) {
        int curr = q.front();
        q.pop();
        result.push_back(curr);

        // 현재 정점과 연결된 인접 정점 확인
        for (int next : adj[curr]) {
            indegree[next]--; // 간선 제거 효과

            // 새롭게 진입 차수가 0이 된 정점이 있다면 큐에 삽입
            if (indegree[next] == 0) {
                q.push(next);
            }
        }
    }

    // 3. 사이클 감지
    // 정렬된 원소의 개수가 전체 정점 개수와 다르다면 사이클이 존재함
    if (result.size() != V) {
        return vector<int>(); // 빈 벡터 반환 (정렬 불가능)
    }

    return result;
}
