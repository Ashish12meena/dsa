public class _24_MergeSrotedArrayWithoutExtraSpaceUsingGapMethod {

    public static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2); // ceil(gap/2)
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };

        int n = arr1.length;
        int m = arr2.length;

        int gap = nextGap(n + m);

        while (gap > 0) {

            int i = 0;
            int j = gap;

            while (j < (n + m)) {

                // case 1: both pointers in arr1
                if (i < n && j < n) {
                    if (arr1[i] > arr1[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }

                // case 2: i in arr1, j in arr2
                else if (i < n && j >= n) {
                    if (arr1[i] > arr2[j - n]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                // case 3: both in arr2
                else {
                    if (arr2[i - n] > arr2[j - n]) {
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }

        // print result
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}