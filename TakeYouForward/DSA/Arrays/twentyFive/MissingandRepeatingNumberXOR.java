public class MissingandRepeatingNumberXOR {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 6, 2, 1, 1 };
        int n = arr.length;

        int xor = 0;

        // Step 1: XOR all array elements and 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }

        // xor = missing ^ repeating

        // Step 2: find rightmost set bit (to divide numbers into 2 groups)
        int setBit = xor & -xor;

        int bucket1 = 0;
        int bucket2 = 0;

        // Step 3: divide into two groups and XOR separately
        for (int i = 0; i < n; i++) {

            if ((arr[i] & setBit) != 0)
                bucket1 ^= arr[i];
            else
                bucket2 ^= arr[i];

            if (((i + 1) & setBit) != 0)
                bucket1 ^= (i + 1);
            else
                bucket2 ^= (i + 1);
        }

        // bucket1 and bucket2 are missing & repeating (but which is which?)

        int missing = -1, repeating = -1;

        // Step 4: check which one appears in array
        for (int i = 0; i < n; i++) {
            if (arr[i] == bucket1) {
                repeating = bucket1;
                missing = bucket2;
                break;
            } else if (arr[i] == bucket2) {
                repeating = bucket2;
                missing = bucket1;
                break;
            }
        }

        System.out.println("Missing: " + missing);
        System.out.println("Repeating: " + repeating);
    }
}