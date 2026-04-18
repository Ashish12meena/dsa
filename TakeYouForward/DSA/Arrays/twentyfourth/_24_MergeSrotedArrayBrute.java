public class _24_MergeSrotedArrayBrute {
    public static void main(String[] args) {
            int arr1[] = { 1, 3, 5, 7 };
            int arr2[] = { 0, 2, 6, 8, 9 };

        int m = arr1.length;
        int n = arr2.length;

        int arr3[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < arr1.length; k2++) {
            arr1[k2] = arr3[k2];
        }

        int index = 0;
        for (int k2 = arr1.length; k2 < arr3.length; k2++) {
            arr2[index] = arr3[k2];
            index++;
        }


        for (int l : arr1) {
            System.out.println(l);
        }

        for (int l : arr2) {
            System.out.println(l);
        }

    }
}