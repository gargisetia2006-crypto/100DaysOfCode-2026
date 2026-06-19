package DSA.GargiSetia_590017733.Day5;
class Solution {
    public boolean canJump(int[] nums) {
        int maxreach =0 ;
        for (int i =0 ; i<nums.length ; i++){
            // agr i current se bda h 
            if ( i > maxreach){
                return false ;
            }
        
        // agr chota h to mac reach ko update kr denge 
        maxreach = Math.max(maxreach , i + nums[i]);

        // agr kisi point p amxreach aagya jha last index p ja skte h 
        if(maxreach >= nums.length-1){
            return true ; 
        }
        }
        
    
    return true ;  
}
    }