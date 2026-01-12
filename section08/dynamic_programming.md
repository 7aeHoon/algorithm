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
1. 탐색할 범위의 `하한(low)`과 `상한(high)`을 설정합니다.
2. 하한과 상한의 `중간(mid)`을 구합니다.
3. 만약 찾는 값이 중간과 같다면, 탐색을 종료합니다.
4. 만약 찾는 값이 중간보다 작다면, `상한 = 중간 - 1`로 범위를 제한합니다.
5. 만약 찾는 값이 중간보다 크다면, `하한 = 중간 + 1`로 범위를 제한합니다.

### 3. 구현 팁
만약 문제에서 다음 두 가지를 모두 만족하면 `DP`를 고려합니다.
1. `완전탐색`으로 가능한가?
   - 시간복잡도 고려
2. `메모이제이션`으로 해결할 수 있나?
   - 배열의 크기 고려

### 4. 예시 코드
```cpp
bool binarySearch(const vector<long long>& arr, long long target) {
    long long left = 0;
    long long right = arr.size() - 1;

    while (left <= right) {
        long long mid = (left + right) / 2;

        if (arr[mid] == target)
            return true;
        else if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return false;
}
```
