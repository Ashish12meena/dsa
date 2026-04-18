public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};

        // sum of n numbers
        int n = 5;
        int totalSum = (n*(n+1))/2;
        int arrSum = 0;

        for (int i : arr) {
            arrSum = arrSum+i;
        }

        int numberMissing = totalSum-arrSum;
        System.out.println();
        System.out.println(numberMissing);

    }
}
