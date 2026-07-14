import java.util.Scanner;
import java.util.Stack;

public class Question2 {

    // Function to insert element at the bottom
    public static void pushBottom(Stack<Integer> st, int element) {

        // Base Case
        if (st.isEmpty()) {
            st.push(element);
            return;
        }

        // Store the top element
        int temp = st.pop();

        // Recursive call
        pushBottom(st, element);

        // Push the stored element back
        st.push(temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements in stack: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements (bottom to top):");

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        System.out.print("Enter the element to insert at the bottom: ");
        int element = sc.nextInt();

        pushBottom(st, element);

        System.out.println("Stack after inserting at bottom:");
        System.out.println(st);

        sc.close();
    }
}