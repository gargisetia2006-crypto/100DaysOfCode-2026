class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
        int end = n-1 ; 
        int j =0 ; 
        for (int i =0 ; i< n ; i++){
            if (nums[i]!=0){
               int temp = nums[i];
               nums[i]=0 ;
               nums[j]= temp ; 
               j++;
            }
        }
        }
        }
        
// ab ye hme chahie ki relative order  maintain ho yha p hmare ism 