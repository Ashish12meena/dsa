public class MissingandRepeatingNumberExtremeBruteForce {
    public static void main(String[] args) {
        int missing = -1;
        int repeating = -1;

        int arr[] = { 4, 3, 6, 2, 1, 1 };

        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            boolean present = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count++;
                    present = true;
                }

            }
            if (present==false) {
                missing= i;
            }
            if (count>1) {
                repeating = i;
            }
        }

        System.out.println(missing);
        System.out.println(repeating);


    }
}
