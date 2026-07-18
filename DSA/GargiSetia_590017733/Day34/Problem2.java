import java.util.Scanner;

public class Problem2 {

    public static int maximumVisiblePeople(int[] arr) {
        int n = arr.length;
        int maxVisible = 1;

        for (int i = 0; i < n; i++) {

            int count = 1; // Count self

            // Look Left
            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] < arr[i]) {
                    count++;
                } else {
                    break;
                }
            }

            // Look Right
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[i]) {
                    count++;
                } else {
                    break;
                }
            }

            maxVisible = Math.max(maxVisible, count);
        }

        return maxVisible;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Visible People = " + maximumVisiblePeople(arr));

        sc.close();
    }
}