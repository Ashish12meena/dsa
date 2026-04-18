public class FindTheNumberOnceAndOtherTwice {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};

        int number=0;

        // for (int i = 1; i < arr.length; i=i+2) {
        //     if (arr[i]!=arr[i-1]) {
        //         number = arr[i-1];
        //         System.out.println("number is: "+number);
        //         return;
        //     }
        // }
    
        // number = arr[arr.length-1];
        
        for (int i = 0; i < arr.length; i++) {
            number = number^arr[i];
        }
        
        System.out.println("number is: "+number);

    }
}
