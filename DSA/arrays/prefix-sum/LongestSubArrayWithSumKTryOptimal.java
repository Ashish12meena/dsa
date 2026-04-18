public class LongestSubArrayWithSumKTryOptimal {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;

        int left = 0;
        int currentSum = 0;

        int bestStart = 0;
        int bestEnd = -1; // inclusive
        int maxLen = 0;

        int right = 0;

        while (right < arr.length) {

            // expand window
            currentSum += arr[right];

            // shrink window if sum exceeds k
            while (currentSum > k && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            // check for valid window
            if (currentSum == k) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    bestStart = left;
                    bestEnd = right;
                }
            }

        }

        // print result
        System.out.println("Longest subarray with sum " + k + ":");
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
