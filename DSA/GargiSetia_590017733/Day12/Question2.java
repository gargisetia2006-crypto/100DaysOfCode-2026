import java.util.*;

public class Question2 {

    // Count total distinct characters in the string
    public static int countDistinct(char[] arr) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : arr) {
            set.add(ch);
        }

        return set.size();
    }

    // Add character to current window
    public static void addCharacter(HashMap<Character, Integer> map, char ch) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    // Remove character from current window
    public static void removeCharacter(HashMap<Character, Integer> map, char ch) {
        map.put(ch, map.get(ch) - 1);

        if (map.get(ch) == 0) {
            map.remove(ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int required = countDistinct(arr);

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        int answer = Integer.MAX_VALUE;

        while (right < arr.length) {

            // Expand window
            addCharacter(map, arr[right]);

            // Window contains all distinct characters
            while (map.size() == required) {

                answer = Math.min(answer, right - left + 1);

                // Shrink window
                removeCharacter(map, arr[left]);
                left++;
            }

            right++;
        }

        System.out.println("Smallest Window Length = " + answer);
    }
}