class Solution {

    int count = 0;

    public int inversionCount(int[] arr) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }

    public void mergeSort(int[] arr, int start, int end) {

        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;

            } else {

                // ******** ONLY NEW LINE ********
                count += (mid - left + 1);

                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }
}