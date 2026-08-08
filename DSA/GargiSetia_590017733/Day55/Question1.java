class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // create a min heap 
        PriorityQueue < int[] > pq = new PriorityQueue<>(( a , b ) -> a[0] - b[0]);
        
        // adding the  top k elements in the pq 
        for(int i =0 ; i < nums.length ; i++){
            pq.offer(new int[] { nums[i] , i });

            // if size > k 
            if( pq.size() > k ){
                pq.poll() ; //min heap has smallest element at the top 
            }
        }

        List< int[] > list = new ArrayList<>();
        while ( !pq.isEmpty()){
            list.add(pq.poll());
        }


        Collections.sort(list , ( a, b ) -> a[1] - b[1]);
        int ans [] = new int [k];

        for (int i =0 ; i < k ; i++){
            ans[i] = list.get(i)[0]; 

        }
return ans ; 
    }
}



