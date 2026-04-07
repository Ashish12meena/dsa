public class CheckIsArraySortedInAscendingOrder {
    public  int largestElement(int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largestElement) {
                largestElement = nums[i];
            }
        }
        return largestElement;
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(isSorted(arr));

    }
}
