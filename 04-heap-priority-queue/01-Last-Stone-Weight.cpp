#include <bits/stdc++.h>

using namespace std;

int lastStoneWeight(vector<int>& stones) {
    int answer;

    priority_queue<int> pq;

    for (const auto& stone : stones) {
        pq.push(stone);
    }

    while (!pq.empty()) {
        if (pq.size() == 1) {
            answer = pq.top();
            break;
        }

        int y = pq.top();
        pq.pop();

        int x = pq.top();
        pq.pop();

        if (y != x) {
            pq.push(y - x);
        }
    }

    if (pq.empty()) {
        answer = 0;
    }

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    return 0;
}