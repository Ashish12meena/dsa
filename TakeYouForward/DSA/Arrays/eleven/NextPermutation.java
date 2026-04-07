
public class NextPermutation {
    // 1,2,3,4,5

    private static void nextPermutation(int arr[]) {
        int n = arr.length;
        int i = n - 2;

        while (arr[i] > arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int minIndex = findNearesGreater(i, arr);
            if (minIndex != -1) {
                swap(i, minIndex, arr);
            }
        }

        reverse(i, arr);
    }

    private static void reverse(int i, int[] arr) {
        int l = i;
        int r = arr.length - 1;
        while (l < r) {
            swap(i++, r--, arr);
        }
    }

    private static void swap(int i, int minIndex, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    private static int findNearesGreater(int i, int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int j = i; j < arr.length; j++) {
            if (arr[j] > arr[i] && arr[j] < min) {
                min = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        nextPermutation(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}