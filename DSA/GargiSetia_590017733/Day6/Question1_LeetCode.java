package DSA.GargiSetia_590017733.Day6;
class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: Exclude last house
        int prev1 = 0, prev2 = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        int case1 = prev1;

        // Case 2: Exclude first house
        prev1 = 0;
        prev2 = 0;
        for (int i = 1; i < n; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        int case2 = prev1;

        return Math.max(case1, case2);
    }
}