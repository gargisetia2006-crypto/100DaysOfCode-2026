import java.util.*;

public class Solution {

    public static List<Integer> maximizePrefixDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex && i != maxIndex) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5};
        System.out.println(maximizePrefixDifference(arr));
    }
}