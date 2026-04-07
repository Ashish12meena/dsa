public class SortArrayOfZerosOnesAndTwoOptimalDuctchFlagAlgorithm {

    public static void swap(int arr[] , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {

        int a[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };

        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;

            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            }
        }

        System.out.println();

        for (int i : a) {
            System.out.println(i);
        }
    }
}