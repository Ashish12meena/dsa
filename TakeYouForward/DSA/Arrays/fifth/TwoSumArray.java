public class TwoSumArray {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };

        int target = 14;

        int firstValue = -1;
        int lastValue = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i]+arr[j])==target) {
                    firstValue = arr[i];
                    lastValue = arr[j];
                    break;
                }
            }
        }

        if (firstValue==-1) {
            System.out.println("There is no two sum for target");
        }

        System.out.println("firstValue : "+firstValue);
        System.out.println("secondValue : "+lastValue);
    }
}
