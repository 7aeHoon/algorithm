#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<string> id_list, vector<string> report, int k) {
    unordered_map<string, unordered_set<string>> reporters;
    unordered_map<string, int> mailCount;

    for (const string& entry : report) {
        string from, to;
        istringstream ss(entry);
        ss >> from >> to;

        reporters[to].insert(from);
    }

    for (const auto& [target, users] : reporters) {
        if (users.size() < k) {
            continue;
        }

        for (const string& user : users) {
            mailCount[user]++;
        }
    }

    vector<int> answer;
    answer.reserve(id_list.size());

    for (const string& id : id_list) {
        answer.push_back(mailCount[id]);
    }

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    return 0;
}