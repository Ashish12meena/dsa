import java.util.Arrays;

public class _26_CountInversionInArray {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        int count = mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        System.out.println("Inversion Count: " + count);
    }

    // divide array + return inversion count
    public static int mergeSort(int arr[], int low, int high) {
        if (low >= high) return 0; // no inversion

        int mid = (low + high) / 2;

        int leftCount = mergeSort(arr, low, mid);
        int rightCount = mergeSort(arr, mid + 1, high);

        int mergeCount = merge(arr, low, mid, high);

        return leftCount + rightCount + mergeCount;
    }

    // merge + count inversions
    public static int merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];

                // 🔥 main logic
                count += (mid - left + 1);
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

        return count;
    }
}