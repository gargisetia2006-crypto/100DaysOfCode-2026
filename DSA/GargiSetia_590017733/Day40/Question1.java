import java.util.*;

public class Solution {

    public static List<Integer> maxTemperature(int[] temperatures, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && temperatures[dq.peekLast()] <= temperatures[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Window complete
            if (i >= k - 1) {
                ans.add(temperatures[dq.peekFirst()]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(maxTemperature(temperatures, k));
    }
}