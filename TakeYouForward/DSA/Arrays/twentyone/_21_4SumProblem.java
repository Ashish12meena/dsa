import java.util.Arrays;

public class _21_4SumProblem {
    public static void main(String[] args) {
        int arr[] = { 0,0,0,0,0,0,0,0,0};

        Arrays.sort(arr);

        int n = 0;

        // we first sort it

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < arr.length - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == n) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                        k++;
                        l--;

                        // skip duplicates
                        while (k < l && arr[k] == arr[k - 1])
                            k++;
                        while (k < l && arr[l] == arr[l + 1])
                            l--;
                    } else if (sum < n) {
                        k++; // move left pointer forward
                    } else {
                        l--; // move right pointer backward
                    }
                }

            }
        }
    }
}
