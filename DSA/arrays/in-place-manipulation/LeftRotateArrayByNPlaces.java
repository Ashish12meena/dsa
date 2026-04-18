public class LeftRotateArrayByNPlaces {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; 
        
        int times = 6;

        for (int i = 0; i < (times%arr.length); i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }

        System.out.println();

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
