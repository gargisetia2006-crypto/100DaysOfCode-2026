public static int[] cardGameStrategy(int[] arr) {

    int n = arr.length;

    int i = 0;
    int j = n - 1;

    int player1 = 0;
    int player2 = 0;

    boolean turn = true;

    while (i <= j) {

        int value;

        if (arr[i] >= arr[j]) {
            value = arr[i];
            i++;
        } else {
            value = arr[j];
            j--;
        }

        if (turn) {
            player1 += value;
            turn = false;
        } else {
            player2 += value;
            turn = true;
        }
    }

    return new int[]{player1, player2};
}