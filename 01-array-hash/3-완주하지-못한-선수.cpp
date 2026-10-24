#include <string>
#include <unordered_map>
#include <vector>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    unordered_map<string, int> counts;
    string answer;

    for (const string& name : participant) {
        counts[name]++;
    }

    for (const string& name : completion) {
        counts[name]--;
    }

    for (const auto& [name, count] : counts) {
        if (count > 0) {
            answer = name;
            break;
        }
    }

    return answer;
}