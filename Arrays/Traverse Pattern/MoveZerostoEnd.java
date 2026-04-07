public class MoveZerostoEnd {

    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 0, 5, 2 };

        int postitionPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[postitionPointer] = arr[i];
                postitionPointer++;
            } 
        }

        for (int i = postitionPointer; i < arr.length; i++) {
            arr[i] = 0;
        }
        

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
