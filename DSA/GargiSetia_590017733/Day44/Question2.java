class Solution {
    public String favoriteNumber(int[] nums, int favoriteIndex, int k) {

        int favorite = nums[favoriteIndex - 1];

        int greater = 0;
        int equal = 0;

        for (int num : nums) {
            if (num > favorite) {
                greater++;
            } else if (num == favorite) {
                equal++;
            }
        }

        if (greater >= k) {
            return "NO";
        } 
        else if (greater + equal <= k) {
            return "YES";
        } 
        else {
            return "MAYBE";
        }
    }
}