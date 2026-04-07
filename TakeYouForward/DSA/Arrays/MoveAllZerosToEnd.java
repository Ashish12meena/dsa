public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 2 };

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}