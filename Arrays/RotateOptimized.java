public class RotateOptimized {
      // 🚀 Optimized right rotation
    public static void rotateRight(int[] arr, int times) {
        int n = arr.length;
        times = times % n; // In case times > n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse first 'times' elements
        reverse(arr, 0, times - 1);
        // Step 3: Reverse the remaining elements
        reverse(arr, times, n - 1);
    }

    // 🔄 Helper to reverse a segment of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 🔬 Example usage
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int rotateBy = 4;

        long start = System.nanoTime();
        rotateRight(arr, rotateBy);
        long end = System.nanoTime();

        System.out.println("Optimized Right Rotation Time: " + (end - start) + " ns");

        // Uncomment to print first few elements of rotated array
        // for (int i = 0; i < 20; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}
