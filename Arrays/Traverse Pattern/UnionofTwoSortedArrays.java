public class UnionofTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int n = arr1.length;
        int[] arr2 = { 2, 3, 4, 4, 5 ,7, 8};
        int m = arr2.length;
        int arr[] = new int[n + m];

        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int arrPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr1Pointer<arr1.length) && arr1[arr1Pointer] <= arr2[arr2Pointer]) {
                if (arrPointer > 0 && arr1[arr1Pointer] > arr[arrPointer-1]) {
                    arr[arrPointer] = arr1[arr1Pointer];
                    arrPointer++;
                }
                if (arrPointer == 0) {
                    arr[arrPointer] = arr1[arr1Pointer];
                    arrPointer++;
                    
                }
                arr1Pointer++;
            } else if (arr2Pointer<arr2.length) {
                if (arrPointer > 0 && arr2[arr2Pointer] > arr[arrPointer-1]) {
                    arr[arrPointer] = arr2[arr2Pointer];
                    arrPointer++;
                }
                if (arrPointer == 0) {
                    arr[arrPointer] = arr2[arr2Pointer];
                    arrPointer++;
                }
                 arr2Pointer++;

            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}