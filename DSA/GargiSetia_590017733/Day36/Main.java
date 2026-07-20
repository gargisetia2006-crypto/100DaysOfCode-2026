import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int minute = 0;

        while (!q.isEmpty()) {
            // Serve front person
            int served = q.poll();
            minute++;

            if (served == k) {
                System.out.println(minute);
                return;
            }

            // Move new front to back if odd
            if (!q.isEmpty() && q.peek() % 2 != 0) {
                q.offer(q.poll());
            }
        }
    }
}