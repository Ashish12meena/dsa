public class MaxImumSubArray {
    public static int sumArray(int arr[], int i, int j) {
        int sum = 0;
        for (int j2 = i; j2 <= j; j2++) {
            sum = sum + arr[j2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, 1, 5, -3 };
        int max = Integer.MIN_VALUE;
        int mip = 0;
        int mep = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                 sum = sum+arr[j];
                if (sum>max) {
                    mip=i;
                    mep=j;
                    max=sum;
                }
            }
        }

        System.out.println(""+mip+"  "+mep);

    }
}
