public class LeftRotateByN {

    public static void rotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static boolean rotateByTimes(int[] arr, int times) {
        if (arr == null || arr.length == 0) {
            return false; 
        }
        if (times < 0) {
            return false; 
        }

        int newTimes = times % arr.length;
        if (newTimes == 0) {
            return true;  // nothing to do
        }

        for (int i = 0; i < newTimes; i++) {
            rotate(arr);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        boolean ok = rotateByTimes(arr, -1);
        if (!ok) {
            System.out.println("Invalid input");
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
