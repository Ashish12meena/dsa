public class LeftRotateArray2ndApproachh {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int arr2[] = new int[arr.length];

        int times = 3;

        int d = times % arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr2[((i - d) + arr.length) % arr2.length] = arr[i];
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
    