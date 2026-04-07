public class ZigZagArrayMethod1 {
    public static int[] convertToZigZagArray(int arr[]) {
        boolean isIndexEven = true;
        for (int arrIndex = 0; arrIndex < arr.length - 1; arrIndex++) {
            if ((isIndexEven && (arr[arrIndex] > arr[arrIndex + 1]))||((!isIndexEven) && (arr[arrIndex] < arr[arrIndex + 1]))) {
                int temp = arr[arrIndex];
                arr[arrIndex] = arr[arrIndex + 1];
                arr[arrIndex + 1] = temp;
            }
            isIndexEven = !isIndexEven;
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
