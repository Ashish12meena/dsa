public class findSecondMaximum {
    public static void update(int number, int[] maxArr) {
        if (number > maxArr[1]) {
            maxArr[0] = maxArr[1];
            maxArr[1] = number;
            return;
        }

        if (number > maxArr[0]) {
            maxArr[0] = number;
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 12, 11, 30, 8, 23, 19, 9, 30 };
        int maxArr[] = new int[2];
         maxArr[1] = Integer.MIN_VALUE;
         maxArr[0] = Integer.MIN_VALUE;
        // here maxArr[0] = seocndMax and maxArr[1]=max

        for (int i = 0; i < arr.length; i++) {
            update(arr[i], maxArr);
        }   
        

        System.out.println();

        System.out.println("second max is : "+maxArr[0]);
        System.out.println(maxArr[1]);
    }
}