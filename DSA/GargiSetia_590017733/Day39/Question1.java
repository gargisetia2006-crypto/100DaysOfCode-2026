import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<int[]> q = new LinkedList<>();

        // Store {personIndex, ticketsRemaining}
        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[]{i, tickets[i]});
        }

        int time = 0;

        while (!q.isEmpty()) {

            int[] person = q.poll();

            // Buy one ticket
            person[1]--;
            time++;

            // If this person has finished buying all tickets
            if (person[1] == 0) {

                // Is this the person we were waiting for?
                if (person[0] == k) {
                    return time;
                }

            } else {
                // Still needs more tickets, go to the back
                q.offer(person);
            }
        }

        return time;
    }
}