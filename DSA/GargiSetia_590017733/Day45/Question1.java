class Solution {


    public int binarysearch(int [] nums , int target , int start , int  end ){

        while ( start <= end ){

             int mid = (start + end )/ 2;
             if (nums[mid] == target){
                return mid ; 
             }
             else if ( nums[mid] > target ){
                end = mid -1 ; 
             }
             else if( target > nums[mid]){
                start = mid + 1; 

             }
        }
             return start ;   
        
    }
    public int searchInsert(int[] nums, int target) {
       int idx =  binarysearch(nums , target , 0 , nums.length -1  );
       return idx ; 
    }
}