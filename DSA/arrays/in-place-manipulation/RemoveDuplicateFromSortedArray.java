/**
 * PROBLEM:
 * - Given a SORTED array, remove duplicates IN-PLACE.
 * - We are NOT creating a new array.
 * - We only care about the unique elements at the start of the array.
 *
 * CORE IDEA (Two-pointer thinking):
 * - One pointer (i) scans the array.
 * - Another pointer (uniqueLength) tracks the index
 *   where the next unique element should be placed.
 *
 * WHY THIS WORKS:
 * - Because the array is SORTED, all duplicates come next to each other.
 * - So if current element != last unique element → it's a new value.
 */
public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5 };

        /*
         * uniqueLength represents:
         * - Index of the LAST UNIQUE element found so far
         * - Also indirectly tells how many unique elements exist
         *
         * Start with 0 because:
         * - First element is ALWAYS unique in a non-empty array
         */
        int uniqueLength = 0;

        /*
         * Start loop from index 1:
         * - Index 0 is already considered unique
         * - We compare current element with last unique element
         */
        for (int i = 1; i < arr.length; i++) {

            /*
             * If current element is DIFFERENT from the last unique element,
             * it means we found a new unique number.
             */
            if (arr[i] != arr[uniqueLength]) {

                /*
                 * Move uniqueLength forward because
                 * we are about to store a new unique value.
                 */
                uniqueLength++;

                /*
                 * Place the new unique value at uniqueLength index.
                 * This overwrites duplicates earlier in the array.
                 */
                arr[uniqueLength] = arr[i];
            }
        }

        /*
         * At this point:
         * - Unique elements are stored from index 0 to uniqueLength
         * - Elements after uniqueLength are irrelevant (garbage)
         */

        System.out.println("Unique elements:");
        for (int i = 0; i <= uniqueLength; i++) {
            System.out.println(arr[i]);
        }
    }
}
