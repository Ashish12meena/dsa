public class MaxSumAmongRotations {
    public static int maxSum(int[] arr) {
        int n = arr.length;

        int arrSum = 0; // sum of all elements
        int currVal = 0; // F(0)

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        for (int i = 1; i < n; i++) {
            // Compute next rotation using the formula
            currVal = currVal + arrSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
            
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1, 3, 4};
        System.out.println(maxSum(arr)); // Efficient and elegant
    }
}
