class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer , Integer >  map  = new HashMap<>();
        for (int i =0 ; i<nums.length ; i++){
            if (nums[i] % 2 ==0 ){
                // mtlb agr even number h to 
                // check if hashmap has the key if yes count bda do else bna k key add the element 
                if ( map.containsKey (nums[i])){
                    map.put(nums[i] , map.get(nums[i])+ 1); 
                }
                else{
                    map.put( nums[i] , 1 ) ; 
                }
            }
        }
        int highestvalue  = Integer.MIN_VALUE ; 
        int highestkey = Integer.MIN_VALUE ; 
        

        // handling no even condition 
        if (map.size() == 0 ){
            return -1 ; 
        }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
     if( highestvalue  < value ){
         highestvalue  = value ; 
          highestkey = key ; 
        }
        else if ( highestvalue == value && key < highestkey ){
            highestkey = key ; 
        }
      }

        return highestkey ; 
        
    }
}