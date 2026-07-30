class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        // add elements in the hashset 
        for(int i =0 ; i<nums1.length ; i++){
            hs.add(nums1[i]);
        }

      // create the array to be returned  back 
         int[] result = new int[Math.min(nums1.length, nums2.length)];
         int j =0 ;
        for(int i =0 ; i < nums2.length ; i++){
            if(hs.contains(nums2[i])){
                result[j]= nums2[i];
                j++;
                hs.remove(nums2[i]);
                

            }
        }
        return Arrays.copyOf(result, j);
        
    }
}