public class MajorityElementOptimal {
    // Morree Voting algorithm

    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 3, 7, 3, 3, 0, 3, 5, 3 };
        int count = 0;
        int number = -1;

        for (int i = 0; i < arr.length; i++) {
            if (number != arr[i] && count == 0) {
                number = arr[i];
                count++;
            } else if (number != arr[i]) {
                count--;
            } else {
                count++;
            }
        }
                        System.out.println("number "+number);
    }
}
