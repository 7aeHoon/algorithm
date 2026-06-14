## 동적 계획법 - Dynamic Programming
> 복잡한 문제를 더 작은 하위 문제로 나누어 해결하고, 그 결과를 저장해 두었다가 다시 사용하는 최적화 알고리즘 기법입니다.  
> 즉, "한 번 계산한 것은 두 번 계산하지 않는다"는 전략입니다.

<br>
<img src="https://github.com/user-attachments/assets/f286d1a3-c408-42e3-a8b1-a9241d421e56" width="500" height="400">
<br>

### 1. 전제 조건
DP를 사용하기 위해서는 다음 <ins>두 가지 조건</ins>이 선행되어야 합니다.  
- `최적 부분 구조 (Optimal Substructure)`
    - 큰 문제의 최적해가 작은 문제의 최적해들로부터 구성될 수 있는 구조입니다.  
    - ex) 피보나치 수열: F(n) = F(n - 1) + F(n - 2)
- `중복되는 부분 문제 (Overlapping Subproblems)`
    - 동일한 작은 문제들이 반복적으로 계산되는 구조입니다.

### 2. 작동 원리
DP는 접근 방식에 따라 크게 두 가지로 나뉩니다.
- `Top-Down (메모이제이션 - Memoization)`
    - 큰 문제를 해결하기 위해 작은 문제를 호출하는 방식입니다.
    - <ins>재귀(Recursion)</ins>를 사용하며, 한 번 계산한 결과는 배열 등에 저장해 두었다가 재사용합니다.

- `Bottom-Up (타뷸레이션 - Tabulation)`
   - 작은 문제부터 차례대로 정답을 구해 나가며 전체 문제의 답을 찾는 방식입니다.
   - <ins>반복문</ins>을 사용하며, DP 테이블을 밑바닥부터 채워 나간다는 의미에서 타뷸레이션이라고 합니다.
 
### 3. 구현 팁
만약 문제에서 다음 두 가지를 모두 만족하면 `DP`를 고려합니다.
1. `완전탐색`으로 가능한가?
   - 모든 경우의 수를 따졌을 때 시간 내에 통과하기 어렵다면 DP를 의심합니다.
2. `메모이제이션`으로 해결할 수 있나?
   - 하위 문제의 결과가 상위 문제에 영향을 미치며, 그 결과가 중복되어 사용되는지 확인합니다.
  
### 추가 - 냅색 (Knapsack)
> 제한된 용량(capacity) 안에서 물건을 선택해 ‘가치’를 최대화(또는 비용을 최소화) 하는 DP의 대표 유형입니다.
1. `0/1 냅색 (0/1 Knapsack)`
    - 각 물건을 <ins>단 한 번만 사용</ins>할 수 있습니다.
    - 1차원 DP 배열 사용 시, 중복 계산을 막기 위해 <ins>역순</ins>으로 탐색합니다.
  
```cpp
// 0/1 Knapsack: 역순 순회
for (int i = 0; i < n; i++) {
    for (int j = W; j >= weight[i]; j--) {
        dp[j] = max(dp[j], dp[j - weight[i]] + value[i]);
    }
}
```  

2. `완전 냅색 (Unbounded Knapsack)`
    - 동일한 물건을 <ins>무한히 사용</ins>할 수 있음.
    - 같은 물건을 여러 번 담는 것을 허용하므로, <ins>정방향</ins>으로 탐색합니다.
  
```cpp
// Unbounded Knapsack: 정방향 순회
for (int i = 0; i < n; i++) {
    for (int j = weight[i]; j <= W; j++) {
        dp[j] = max(dp[j], dp[j - weight[i]] + value[i]);
    }
}
```  
