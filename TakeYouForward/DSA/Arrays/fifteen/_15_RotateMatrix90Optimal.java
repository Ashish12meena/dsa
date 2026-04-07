public class _15_RotateMatrix90Optimal {
    // public static void swap(int arr[][] ,int i, int j) {
    // int temp = i;
    // i = j;
    // j = temp;
    // }

    public static void swapReverse(int[][] arr, int i, int p, int q) {
        int temp = arr[i][p];
        arr[i][p] = arr[i][q];
        arr[i][q] = temp;
    }
    public static void swap(int[][] arr, int i, int p, int q) {
        int temp = arr[i][p];
        arr[i][p] = arr[q][i];
        arr[q][i] = temp;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int n = arr.length;

        int i = 0;

        //this willl get matrix after reverse that we get real we get by observation
        while (i < n) {
            int p = i+1, q = i+1; // awoid self swap

            while (p < n && q < n) {
                swap(arr, i, p, q);
                p++;
                q++;
            }
            i++;
        }

        // reverse it
        for (int t = 0; t < arr.length; t++) {
            int e = 0;
            int f = n - 1;
            while (e < f) {
                // swap(arr[j][e], arr[j][f]);
                swapReverse(arr, t, e, f);
                e++;
                f--;
            }

        }

        System.out.println();

        for (int r = 0; r < arr.length; r++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[r][j] + " ,");
            }
            System.out.println();
        }

    }
}
