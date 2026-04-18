public class _17_countSubarrayEqualsK {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;

        int i = 0, sum = 0, count = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while (sum > k) {
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                count++;
            }
        }
        System.out.println();

        System.out.println(count);
    }
}
