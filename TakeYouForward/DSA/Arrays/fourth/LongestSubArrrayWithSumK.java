public class LongestSubArrrayWithSumK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int sum = 6;
        int starIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                if (currentSum>sum) {
                    break;
                }
                if (currentSum==sum && ((lastIndex-starIndex)<=(j-i))) {
                    starIndex = i;
                    lastIndex = j;
                }
            }
        }


        System.out.println();

        for (int i = starIndex; i <= lastIndex; i++) {  
            System.out.println(arr[i]);
        }
    }
}