/**
 * PROBLEM:
 * - Find unique elements from an UNSORTED array.
 * - Order should be preserved (first occurrence wins).
 * - We are NOT using Set or Map (manual logic).
 *
 * CORE IDEA:
 * - Maintain a second array (arr2) that stores only unique values.
 * - Before inserting a number, check if it already exists in arr2.
 *
 * WHY THIS APPROACH:
 * - Unsorted array → duplicates are NOT adjacent.
 * - Two-pointer trick won't work directly.
 * - So we trade memory + time for simplicity.
 */
public class FindUniqueArray {

    public static void main(String[] args) {

        int arr[] = { 3, 4, 2, 1, 3, 4, 7 };

        /*
         * arr2 will store unique elements.
         * Size is same as arr to avoid resizing logic.
         * Only indices 0 to arr2Index are valid.
         */
        int arr2[] = new int[arr.length];

        /*
         * arr2Index tracks:
         * - Last filled index in arr2
         * - Starts at -1 because arr2 is empty initially
         */
        int arr2Index = -1;

        /*
         * Loop through each element in original array
         */
        for (int i = 0; i < arr.length; i++) {

            /*
             * Check if current element already exists in arr2.
             * If NOT present → it's a unique value.
             */
            if (!exist(arr[i], arr2)) {

                /*
                 * Move index forward and store the new unique value.
                 * Using arr2Index + 1 first avoids pre-increment confusion.
                 */
                arr2[arr2Index + 1] = arr[i];
                arr2Index++;
            }
        }

        /*
         * Only elements from index 0 to arr2Index are meaningful.
         * Remaining elements are default zeros.
         */
        System.out.println("Unique elements:");
        for (int i = 0; i <= arr2Index; i++) {
            System.out.println(arr2[i]);
        }
    }

    /**
     * PURPOSE:
     * - Checks whether a value already exists in arr2.
     *
     * LOGIC:
     * - Linear scan because we are not using extra data structures.
     *
     * NOTE:
     * - This causes O(n²) time complexity overall.
     */
    private static boolean exist(int value, int arr[]) {
        for (int j : arr) {
            if (value == j) {
                return true;
            }
        }
        return false;
    }
}
