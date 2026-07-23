import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort meetings by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min Heap stores ending times of meetings
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // First meeting gets one room
        pq.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {

            // If the earliest ending meeting is over,
            // reuse that room
            if (intervals[i][0] >= pq.peek()) {
                pq.poll();
            }

            // Put the current meeting in a room
            pq.offer(intervals[i][1]);
        }

        return pq.size();
    }
}