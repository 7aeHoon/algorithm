## 동적 계획법 - Dynamic Programming
> 정렬된 배열에서 탐색 범위를 절반씩 좁혀가며 타겟 데이터를 찾는 효율적인 알고리즘입니다.  
> 주로 선형 탐색으로 원하는 값을 찾기 어려울 때 사용합니다.

### 1. 전제 조건
- 반드시 `정렬`된 구조
- 임의로 접근이 가능한 구조

### 2. 작동 원리
1. 탐색할 범위의 `하한(low)`과 `상한(high)`을 설정합니다.
2. 하한과 상한의 `중간(mid)`을 구합니다.
3. 만약 찾는 값이 중간과 같다면, 탐색을 종료합니다.
4. 만약 찾는 값이 중간보다 작다면, `상한 = 중간 - 1`로 범위를 제한합니다.
5. 만약 찾는 값이 중간보다 크다면, `하한 = 중간 + 1`로 범위를 제한합니다.

### 3. 시간 복잡도
- `O(log N)`

### 4. 구현 팁
- 오버 플로우 방지를 위해 `long long` 타입을 권장

### 5. 예시 코드
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
