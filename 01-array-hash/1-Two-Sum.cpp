#include <vector>
#include <unordered_set>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> answer;
        vector<int> v = nums;

        sort(v.begin(), v.end());

        int l = 0;
        int r = v.size() - 1;

        while (l < r) {
            int sum = v[l] + v[r];

            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                break;
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == v[l] || nums[i] == v[r]) {
                answer.push_back(i);
            }
        }

        return answer;
    }
};