 public class SortArrayOfZeroOnesAndTwos {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            if (arr[i] == 1) {
                ones++;
            }
            if (arr[i] == 2) {
                twos++;
            }
        }

        int index = 0;

        while (zeros > 0) {
            arr[index] = 0;
            zeros--;
            index++;
        }
        while (ones > 0) {
            arr[index] = 1;
            ones--;
            index++;
        }
        while (twos > 0) {
            arr[index] = 2;
            twos--;
            index++;
        }
        System.out.println();

        for (int i : arr) {
            System.out.println(i);
        }

    }
}