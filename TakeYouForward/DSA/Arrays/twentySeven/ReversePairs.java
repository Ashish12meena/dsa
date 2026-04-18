import java.util.Arrays;

public class ReversePairs {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        int count = mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse Pair Count: " + count);
    }

    public static int mergeSort(int arr[], int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;

        int left = mergeSort(arr, low, mid);
        int right = mergeSort(arr, mid + 1, high);

        int count = countPairs(arr, low, mid, high); // 🔥 important step

        merge(arr, low, mid, high);

        return left + right + count;
    }

    // 🔥 count reverse pairs BEFORE merge
    public static int countPairs(int arr[], int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        return count;
    }

    // same merge as yours
    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}