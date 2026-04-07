public class MaximumConsecutiveOnes {
    public static int countMaxConsecutiveOnes(int arr[]) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount = currentCount + 1;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
        System.out.println();
        System.out.println(countMaxConsecutiveOnes(arr));
    }
}
