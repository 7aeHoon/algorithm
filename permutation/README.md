## 순열 (Permutation)
> 서로 다른 $N$개 중에서 $R$개를 택해 순서를 고려하여 나열하는 경우의 수를 의미합니다. (순서가 다르면 다른 경우로 취급)

### 1. 전제 조건
- 원소의 `순서가 의미가 있습니다.`
- 중복을 허용하지 않는 기본 순열의 경우, 이미 선택한 원소는 다음 선택에서 제외해야 합니다.

### 2. 작동 원리
1. **next_permutation**: 배열이 `오름차순으로 정렬된 상태`에서 시작하여, 사전 순으로 다음으로 큰 순열을 찾아가며 배열의 원소 자체를 변형시킵니다.
2. **재귀(DFS/백트래킹)**: 각 자리에 올 수 있는 원소를 하나씩 선택하고, 이미 사용한 원소는 `visited` 배열로 체크하여 중복 선택을 방지하면서 깊이 우선 탐색을 진행합니다.

### 3. 시간 복잡도
- **$O(N!)$** 또는 **$O(_N P_R)$**
  - $N$개의 원소를 모두 나열하는 경우 가질 수 있는 가짓수가 $N!$ (팩토리얼)입니다.
  - 따라서, 원소의 개수가 조금만 많아져도 연산량이 폭발적으로 증가합니다. (보통 코딩 테스트에서는 $N \le 10$ 내외일 때 사용 가능)

### 4. 구현 방법 1: `next_permutation` 사용
```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// N개의 원소 중 N개를 모두 고르는 순열
void getPermutationsSTL(vector<int> v) {
    // 1. 반드시 오름차순 정렬 선행
    sort(v.begin(), v.end());

    // 2. do-while 문을 이용하여 순열 생성
    do {
        // 현재 순열 출력 혹은 결과 벡터에 저장
        for (int num : v) {
            cout << num << " ";
        }
        cout << "\n";
        
    } while (next_permutation(v.begin(), v.end())); 
    // 다음 순열이 존재하면 true를 반환하고 v를 다음 순열로 변형함, 없으면 false 반환
}
```

### 4. 구현 방법 2: `재귀(DFS/백트래킹)` 사용
```cpp
#include <iostream>
#include <vector>

using namespace std;

int N, R;
vector<int> current_perm; // 현재 만들어지고 있는 순열을 저장
vector<bool> visited;     // 각 원소의 사용 여부 체크

/**
 * 백트래킹을 이용한 순열 구하기
 * @param cnt 현재까지 뽑은 원소의 개수
 * @param v 원본 데이터 배열
 */
void dfsPermutation(int cnt, const vector<int>& v) {
    // R개를 모두 뽑았다면 하나의 순열이 완성됨 (기저 조건)
    if (cnt == R) {
        for (int num : current_perm) {
            cout << num << " ";
        }
        cout << "\n";
        return;
    }

    // 모든 원소를 돌면서 사용할 수 있는 원소를 탐색
    for (int i = 0; i < N; i++) {
        if (visited[i]) continue; // 이미 사용한 원소는 패스

        visited[i] = true;                 // 1. 방문 체크
        current_perm.push_back(v[i]);      // 2. 원소 선택

        dfsPermutation(cnt + 1, v);        // 3. 다음 자리 원소 고르러 가기 (재귀 호출)

        current_perm.pop_back();           // 4. 원소 선택 취소 (백트래킹)
        visited[i] = false;                // 5. 방문 체크 해제
    }
}

// 실행 예시 함수
void solve(vector<int> v, int r) {
    N = v.size();
    R = r;
    visited.assign(N, false);
    current_perm.clear();
    
    dfsPermutation(0, v);
}
```
