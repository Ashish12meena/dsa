import java.util.Arrays;

public class _20_3SumProblemOptimal {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };

        Arrays.sort(arr);

        int n = 0;

        // we first sort it

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == n) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;

                    // skip duplicates
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                } else if (sum < n) {
                    j++; // move left pointer forward
                } else {
                    k--; // move right pointer backward
                }
            }

            while (i + 1 < arr.length && arr[i] == arr[i + 1])
                i++;
        }

    }

}
