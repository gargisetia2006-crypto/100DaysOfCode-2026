import java.util.*;

public class Question2 {

    public static int[] reconstructArray(int n, int[] b) {

        Arrays.sort(b);

        int[] ans = new int[n];

        int idx = 0;

        for (int i = 0; i < n - 1; i++) {
            ans[i] = b[idx];
            idx += (n - i - 1);
        }

        ans[n - 1] = 1000000000;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = n * (n - 1) / 2;

        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] ans = reconstructArray(n, b);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}