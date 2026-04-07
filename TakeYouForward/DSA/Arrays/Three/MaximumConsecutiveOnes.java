public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int maxConsecutive = 0;
        int currentConsective = 0;
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentConsective++;
                if (currentConsective > maxConsecutive) {
                    maxConsecutive = currentConsective;
                }
            } else {
                currentConsective = 0;
            }
        }
        System.out.println();
        System.out.println(maxConsecutive);
    }
}
