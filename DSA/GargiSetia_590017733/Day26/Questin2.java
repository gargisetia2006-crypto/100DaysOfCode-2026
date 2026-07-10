Arrays.sort(arr);

for(int i = arr.length - 1; i >= 2; i--) {

    int c = arr[i];
    int left = 0;
    int right = i - 1;

    while(left < right) {

        int sum = arr[left] + arr[right];

        if(sum == c) {
            return true;
        }

        else if(sum < c) {
            left++;
        }

        else {
            right--;
        }
    }
}

return false;