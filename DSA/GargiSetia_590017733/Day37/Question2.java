import java.util.*;

class Solution {

    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public int solution(int[] priorities, int location) {

        Queue<Document> queue = new LinkedList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Document(priorities[i], i));
            pq.offer(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {

            Document current = queue.poll();

            if (current.priority == pq.peek()) {

                answer++;
                pq.poll();

                if (current.index == location) {
                    return answer;
                }

            } else {

                queue.offer(current);

            }
        }

        return answer;
    }
}