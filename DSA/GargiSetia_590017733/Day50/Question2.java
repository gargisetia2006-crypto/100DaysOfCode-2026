class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());
    
    // add the stones in the max heap 
        for (int i =0 ; i<stones.length ; i++){
            pq.offer(stones[i]);
        }
        


    // 
    while ( pq.size() >1 ){
        int x = pq.poll();
        int y = pq.poll();


        if ( x != y){
            pq.offer(x-y);
        }
    }
    // agr size 1 se bda ni h mtb ek hi h ya zero h 
    if ( pq.isEmpty()){
        return  0 ;
    }
    return pq.poll();
        
    }
}