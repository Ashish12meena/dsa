public class PairSum {
    public static boolean isPaired(int target, int arr[]) {
        for (int firstPairIndex = 0; firstPairIndex < arr.length-1; firstPairIndex++) {
            for (int secondPairIndex = firstPairIndex+1; secondPairIndex < arr.length; secondPairIndex++) {
                if (arr[firstPairIndex]+arr[secondPairIndex]==target) {
                    System.out.println("pair is "+arr[firstPairIndex]+" : "+arr[secondPairIndex]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 11, 15, 26, 38, 9, 10};
        boolean isPaired =  isPaired(35, arr);
        System.out.println(isPaired);
    }
}
