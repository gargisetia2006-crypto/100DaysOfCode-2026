class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1 ;
        int n = nums.length-1 ;
        int result [] = new int[nums.length];
        while(left <= right){
            if(Math.abs(nums[left]) >=  Math.abs(nums[right])){
                result[n]= nums[left] * nums[left];
                left++;
                n--;

            }
            else{
                 result[n]= nums[right ] * nums[right];
                 right--;
                 n--;
            }
        }
        return result ; 

    }
}