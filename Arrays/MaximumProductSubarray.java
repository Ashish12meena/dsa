public class MaximumProductSubarray{
    public static int findMaximumProductOfSubarray(int arr[]){
        int maxProduct= Integer.MIN_VALUE;
        for (int arrInd = 0; arrInd < arr.length; arrInd++) {
            int current = 1;
            current = (arr[arrInd]*current);
            int iterationIndex = 1;
            if (current>maxProduct) {
                maxProduct = current;
            }
            while (((arrInd+iterationIndex)<arr.length) && (arr[arrInd+iterationIndex]!=0)) {
                if ((current*arr[arrInd+iterationIndex])>maxProduct) {
                    maxProduct = current*arr[arrInd+iterationIndex];
                }
                current = current*arr[arrInd+iterationIndex];
                iterationIndex++;
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        // -2 , 6, -3, -10
        int arr [] = {2,3,4};
       int result = findMaximumProductOfSubarray(arr);
       System.out.println();
        System.out.println(result);
    }
}
