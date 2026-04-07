public class _12_leaderOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                }
            }
            if (!isLeader) {
                arr[i] = 0;
            }
        }
        System.out.println();

        for (int i : arr) {
            if (i!=0) {
                System.out.println(i);
            }
        }
    }
}