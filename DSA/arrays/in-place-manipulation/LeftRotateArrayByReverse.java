public class LeftRotateArrayByReverse {
    public static  void reverse(int arr[], int initial , int lastIndex){
        int currentInt = initial;
        int currentLasgt= lastIndex;

        for (int i = initial; i <= (initial+lastIndex)/2; i++) {
            int temp = arr[currentInt];
            arr[currentInt]=arr[currentLasgt];
            arr[currentLasgt] = temp;
            currentInt++;
            currentLasgt--;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int times= 3;

        reverse(arr, 0, times-1);

        reverse(arr, times, arr.length-1);

        reverse(arr, 0, arr.length-1);

        
        // int times = 3;
        
        // // reverse first part
        // for (int i = 0; i < times; i++) {
            
        // }
        
        for (int i : arr) {
         System.out.println(i);
        }
    }
}


