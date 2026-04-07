public class findMaximum {
    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) { 
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println();
        int arr [] =  {3, 1, 8, 2, 6};
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }
}
