import java.util.*;

public class Question2 {

    static long countDistinctSubsequences(String s) {

        int n = s.length();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        HashMap<Character, Integer> last = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            dp[i] = 2 * dp[i - 1];

            char ch = s.charAt(i - 1);

            if (last.containsKey(ch)) {
                dp[i] -= dp[last.get(ch) - 1];
            }

            last.put(ch, i);
        }

        return dp[n];
    }

    public static String betterString(String s1, String s2) {

        long count1 = countDistinctSubsequences(s1);
        long count2 = countDistinctSubsequences(s2);

        if (count1 >= count2)
            return s1;

        return s2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(betterString(s1, s2));

        sc.close();
    }
}