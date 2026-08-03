class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

         while ( k > 0 ){
            int small = Integer.MAX_VALUE ;
            // smallest ko fetch kr lenge 
            for (int i =0 ; i<nums.length ; i++){
                if ( nums[i] < small ){
                    small = nums[i]; 
                }
            }
            
            // small hi nums p mil jaepehli appearnce or multiplier se multiply krdo 
            for ( int i =0 ; i<nums.length ; i++){
                if ( nums[i] == small ){
                    nums[i] = small * multiplier ; 
                    break ; 
                }
            }
    k--; 
         }
        return nums ; 
    }
}