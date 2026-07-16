import java.util.Scanner;
import java.util.Stack;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> original = new Stack<>();
        Stack<Integer> copy = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            original.push(sc.nextInt());
        }

        // Step 1: Original -> Copy
        while (!original.isEmpty()) {
            copy.push(original.pop());
        }

        // Step 2: Copy -> Original and Temp
        while (!copy.isEmpty()) {
            int x = copy.pop();
            original.push(x);
            temp.push(x);
        }

        System.out.println("\nOriginal Stack: " + original);
        System.out.println("Copied Stack: " + temp);

        sc.close();
    }
}