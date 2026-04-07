public class MaximumSubarraySum {
    public static int find(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            while ( k<arr.length) {
                int sum= 0;
                for (int j = i; j <= k; j++) {
                     sum = sum+arr[j];
                }
                if (sum>max) {
                    max=sum;
                }
                k++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        long start = System.nanoTime();
        int result  =find(arr);
        long end = System.nanoTime();

        System.out.println("Total time taken " + (end - start) + " ns");
        System.out.println();
        System.out.println(result);
    }
}
