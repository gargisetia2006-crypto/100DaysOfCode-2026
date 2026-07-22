import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = n; i >= 1; i--) {
            if (!deque.isEmpty()) {
                deque.addFirst(deque.removeLast());
            }
            deque.addFirst(i);
        }

        while (!deque.isEmpty()) {
            System.out.print(deque.removeFirst());
            if (!deque.isEmpty()) {
                System.out.print(" ");
            }
        }
    }
}