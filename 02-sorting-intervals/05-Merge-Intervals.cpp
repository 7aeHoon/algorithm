#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> merge(vector<vector<int>>& intervals) {
    vector<vector<int>> answer;

    sort(intervals.begin(), intervals.end());

    for (const auto& interval : intervals) {
        if (answer.empty() || answer.back()[1] < interval[0]) {
            answer.push_back(interval);
        } else {
            // 끝 구간
            answer.back()[1] = max(answer.back()[1], interval[1]);
        }
    }

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    return 0;
}