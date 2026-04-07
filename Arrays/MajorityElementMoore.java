public class MajorityElementMoore {
      public static int find(int[] arr) {
        // Step 1: Find candidate using Boyer-Moore Voting
        int count = 0;
        int candidate = -1;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is actually a majority
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > arr.length / 2) ? candidate : -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 2}; // Expected output: 2
        long start = System.nanoTime();
        int result  =find(arr);
        long end = System.nanoTime();

        System.out.println("Total time taken " + (end - start) + " ns");
        System.out.println("Result of majority element: " + result);
    }
}
