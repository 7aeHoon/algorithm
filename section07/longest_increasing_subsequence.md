## 최대 증가 부분 수열 - LIS
> 수열이 주어졌을 때, 그 수열의 부분 수열 중 원소가 오름차순으로 유지되면서 길이가 가장 긴 수열을 찾는 알고리즘입니다.

### 1. 전제 조건
- 반드시 `정렬`된 구조에서 사용합니다.
- 연속일 필요는 없지만 순서는 유지해야 합니다.
- 다음 원소는 이전 원소보다 커야 합니다.

### 2. 작동 원리
- 이전 위치의 값보다 현재 위치의 값이 더 크며, 이때 가장 긴 길이를 찾습니다.
- 이 경우 `현재 위치의 길이 = 이전 위치의 길이 + 1`로 갱신합니다.

### 3. 시간 복잡도
- 방식에 따라 `O(N log N)` 또는 `O(N²)`

### 4. 길이를 찾는 첫 번째 방법
- `DP 테이블`을 사용합니다.
- 시간 복잡도 `O(N²)`

```cpp
int LIS(const vector<int>& v) {
    // 수열에 담긴 원소가 없을 경우
    if (v.empty()) return 0;

    // 모든 원소는 길이 1
    int maxLen = 1;
    int n = v.size();
    vector<int> dp(n, 1);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            // 자신보다 작은 값을 찾고
            if (v[j] < v[i]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
        // 현재까지 구한 길이 중 최대 값으로 갱신
        maxLen = max(maxLen, dp[i]);
    }

    return maxLen;
}
```

### 5. 길이를 찾는 두 번째 방법
- `lower_bound()`를 사용합니다.
- 시간 복잡도 `O(NlogN)`

```cpp
int LIS(const vector<int>& v) {
    vector<int> ans;

    for (const auto& num : v) {
        // 자신보다 크거나 같은 값
        auto it = lower_bound(ans.begin(), ans.end(), num);
        // 없을 경우
        if(it == ans.end()) {
            ans.push_back(num);
        } else {
            *it = num;
        }
    }

    return ans.size();
}
```

### 6. 역추적을 위한 방법
- 이전 위치의 인덱스를 기록합니다.
- 마지막에 배열을 뒤집어 원소를 역추적합니다.
- 시간 복잡도 `O(N²)`

```cpp
vector<int> getLIS(vector<int> v) {
    int n = v.size();
    // lis의 길이
    vector<int> dp(n, 1);
    // 이전 원소의 인덱스
    vector<int> prev(n, -1);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if(v[j] < v[i] && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
                prev[i] = j;
            }
        }
    }

    // 가장 큰 길이를 가지고 있는 인덱스 위치
    int lastIndex = max_element(dp.begin(), dp.end()) - dp.begin();

    vector<int> lis;

    // 역추적
    while(lastIndex != -1) {
        lis.push_back(v[lastIndex]);
        lastIndex = prev[lastIndex];
    }

    // 뒤집기
    reverse(lis.begin(), lis.end());

    return lis;
}
```
