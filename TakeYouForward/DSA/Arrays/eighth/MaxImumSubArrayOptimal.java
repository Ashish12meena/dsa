public class MaxImumSubArrayOptimal {

    public static void main(String[] args) {

        int arr[] = { -2, -3, -4, -1, -2, 1, 5, -3 };

        int max = arr[0];
        int sum = arr[0];

        int start = 0;
        int tempStart = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {

            if (sum < 0) {
                sum = arr[i];
                tempStart = i;
            } else {
                sum += arr[i];
            }

            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println(start + "  " + end);
    }
}