#include <bits/stdc++.h>

using namespace std;

vector<int> dailyTemperatures(vector<int>& temperatures) {
    vector<int> answer(temperatures.size(), 0);

    stack<pair<int, int>> st;

    for (int i = 0; i < temperatures.size(); i++) {
        int temperature = temperatures[i];

        while (!st.empty() && st.top().second < temperature) {
            int index = st.top().first;
            answer[index] = i - index;
            st.pop();
        }

        st.push({i, temperature});
    }

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    return 0;
}