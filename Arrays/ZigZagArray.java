public class ZigZagArray {
    // 4, 3 , 7, 8, 6, 2, 1
    public static int[] convertToZigZagArray(int arr[]) {
        for (int arrIndex = 0; arrIndex < arr.length - 1; arrIndex++) {
            if ((arrIndex % 2 == 0) && (arr[arrIndex] > arr[arrIndex + 1])) {
                int temp = arr[arrIndex];
                arr[arrIndex] = arr[arrIndex + 1];
                arr[arrIndex + 1] = temp;
            }
            if ((arrIndex % 2 != 0) && (arr[arrIndex] < arr[arrIndex + 1])) {
                int temp = arr[arrIndex];
                arr[arrIndex] = arr[arrIndex + 1];
                arr[arrIndex + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
        convertToZigZagArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
