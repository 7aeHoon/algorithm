## 조합 (Combination)
> 서로 다른 $N$개 중에서 순서를 고려하지 않고 $R$개를 택하는 경우의 수를 의미합니다.
> (순서가 달라도 원소 구성이 같으면 같은 경우로 취급)

### 1. 전제 조건
- 원소의 `순서가 의미가 없습니다.` (예: `[1, 2]`와 `[2, 1]`은 동일한 하나의 조합으로 취급)
- 이전에 선택한 원소의 `다음 인덱스부터 탐색`을 이어 나가야 중복 조합이나 중복 탐색을 피할 수 있습니다.

### 2. 작동 원리
1. **STL `next_permutation` 활용**: 크기가 $N$인 배열에 $R$개의 `0`(선택함)과 $N-R$개의 `1`(선택 안 함)을 채워 넣고, 이 마스킹 배열의 순열을 돌려가며 `0`이 위치한 인덱스의 원소만 추출하는 방식입니다.
2. **재귀(DFS) 활용**: 현재 인덱스(`idx`)를 매개변수로 대동하여, 다음 재귀 호출 시에는 `반드시 idx + 1번째 원소부터 탐색하도록 제한`함으로써 순서만 다른 중복 조합이 생성되는 것을 원천 차단합니다.

### 3. 시간 복잡도
- **$O(_N C_R)$**
  - $N$개 중 $R$개를 고르는 조합의 수만큼 연산이 발생합니다. 최악의 경우($R = N/2$) 연산량이 가장 큽니다. 보통 $N \le 20$ 내외일 때 완전 탐색으로 풀이 가능합니다.

### 4. 구현 방법 1: `next_permutation` 사용
- C++에서 조합을 깔끔하게 구현하는 정석적인 꼼수(Trick)입니다. 
- 선택할 개수만큼 `0`을 넣고 나머지를 `1`로 채운 뒤 `next_permutation`을 돌리면, 사전 순으로 탐색하면서 모든 조합의 인덱스 조합을 만들어 줍니다.

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// N개의 원소 중 R개를 고르는 조합
void getCombinationsSTL(const vector<int>& v, int r) {
    int n = v.size();
    
    // 1. 선택 여부를 기록할 마스킹 벡터 생성 (0: 선택, 1: 선택 안함)
    vector<int> mask(n, 1);
    for (int i = 0; i < r; i++) {
        mask[i] = 0; // 앞에 r개만큼 0 채우기
    }

    // 2. mask 배열이 오름차순(0이 앞, 1이 뒤)으로 정렬되어 있으므로 그대로 사용
    do {
        // mask의 값이 0인 인덱스만 원본 배열 v에서 추출
        for (int i = 0; i < n; i++) {
            if (mask[i] == 0) {
                cout << v[i] << " ";
            }
        }
        cout << "\n";
        
    } while (next_permutation(mask.begin(), mask.end()));
}
```

### 4. 구현 방법 2: `재귀(DFS)` 사용

```cpp
#include <iostream>
#include <vector>

using namespace std;

int N, R;
vector<int> current_comb; // 현재 선택된 조합을 저장

/**
 * 백트래킹을 이용한 조합 구하기
 * @param idx 현재 선택 단계에서 탐색을 시작할 원본 배열의 인덱스
 * @param cnt 현재까지 고른 원소의 개수
 * @param v 원본 데이터 배열
 */
void dfsCombination(int idx, int cnt, const vector<int>& v) {
    // R개를 모두 뽑았다면 하나의 조합이 완성됨 (기저 조건)
    if (cnt == R) {
        for (int num : current_comb) {
            cout << num << " ";
        }
        cout << "\n";
        return;
    }

    // idx 이전의 원소들은 이미 고려되었으므로, 오직 idx부터 N-1까지의 원소만 탐색
    for (int i = idx; i < N; i++) {
        current_comb.push_back(v[i]);     // 1. 원소 선택

        // 중요: 다음 재귀에는 현재 인덱스인 i보다 1 큰 'i + 1'을 넘겨줌 (중복 방지)
        dfsCombination(i + 1, cnt + 1, v); // 2. 다음 원소 고르러 가기

        current_comb.pop_back();          // 3. 원소 선택 취소 (백트래킹)
    }
}

// 실행 예시 함수
void solve(vector<int> v, int r) {
    N = v.size();
    R = r;
    current_comb.clear();
    
    dfsCombination(0, 0, v);
}
```
