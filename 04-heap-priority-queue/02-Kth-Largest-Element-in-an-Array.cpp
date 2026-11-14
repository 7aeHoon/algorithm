#include <bits/stdc++.h>

using namespace std;

int findKthLargest(vector<int>& nums, int k) {
    int answer;

    priority_queue<int> pq;

    for (const auto& num : nums) {
        pq.push(num);

        if (pq.size() > k) {
            pq.pop();
        }
    }

    answer = pq.top();

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    return 0;
}