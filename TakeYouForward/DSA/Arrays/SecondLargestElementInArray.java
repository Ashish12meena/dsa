public class SecondLargestElementInArray {
    public static int find(int arr[]){
        int largestElementInArrray = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        if (arr.length<2) {
            throw new IllegalArgumentException("Array lenght can't be less than 2");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largestElementInArrray) {
                secondLargestElement=largestElementInArrray;
                largestElementInArrray= arr[i];
            }
        }
        return secondLargestElement;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        System.out.println();
        System.out.println(find(arr));
    }
}
