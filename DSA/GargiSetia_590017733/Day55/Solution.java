import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {

        // make a 2d array to store both of them together 
        int[][] arr = new int[n][2];
     for (int i = 0; i < n; i++) {
    arr[i][0] = efficiency[i];
    arr[i][1] = speed[i];
}

        // sort the array as new the increasing efficieny at most the times 
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // make a min heap to store the speeds 
        PriorityQueue< Integer > pq = new PriorityQueue<>(); // in ascending order simply 
        long  sum =0 ;
        long  maxvalue  =0 ; 
        long currvalue  = 0 ;



        // start the main process of fetching 
        for (int i =0 ; i< arr.length ; i++){
            sum = sum + arr[i][1];
            pq.offer(arr[i][1]);

            if(pq.size()> k ){
            sum = sum - pq.poll() ;
            }
        
            currvalue = sum* arr[i][0]; 
            maxvalue = Math.max(currvalue ,maxvalue); 

        }
        return (int)(maxvalue % 1_000_000_007);
    }
} {
    
}
