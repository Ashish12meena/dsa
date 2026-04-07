import java.util.Arrays;

public class RotateComparison {

    // 🔁 Original (Inefficient) Right Rotation - One-by-One
    public static void rotateOriginalRight(int[] a, int times) {
        while (times-- > 0) {
            int last = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = last;
        }
    }

    // ⚡ Optimized Right Rotation using Reverse Technique
    public static void rotateOptimizedRight(int[] arr, int times) {
        int n = arr.length;
        times = times % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, times - 1);
        reverse(arr, times, n - 1);
    }

    // 🔄 Reverse Helper
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] original = new int[1000];
        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }

        int[] a1 = Arrays.copyOf(original, original.length); // for original method
        int[] a2 = Arrays.copyOf(original, original.length); // for optimized method

        int rotationTimes = 300;

        // Measure Original (Brute-Force Right Rotation)
        long start1 = System.nanoTime();
        rotateOriginalRight(a1, rotationTimes);
        long end1 = System.nanoTime();
        System.out.println("Original (Right) Rotation Time: " + (end1 - start1) + " ns");

        // Measure Optimized Right Rotation
        long start2 = System.nanoTime();
        rotateOptimizedRight(a2, rotationTimes);
        long end2 = System.nanoTime();
        System.out.println("Optimized (Right) Rotation Time: " + (end2 - start2) + " ns");

        // ✅ Final Check
        boolean same = Arrays.equals(a1, a2);
        System.out.println("Arrays match after both rotations? " + same);
    }
}
