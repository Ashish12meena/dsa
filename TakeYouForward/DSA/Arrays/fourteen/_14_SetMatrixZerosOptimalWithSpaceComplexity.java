public class _14_SetMatrixZerosOptimalWithSpaceComplexity {
    public static void markColumn(int arr[][], int c) {
        int n = arr[0].length;

        int i = 0;

        while (i < n) {
            if (arr[i][c] != 0) {
                arr[i][c] = 0;
            }
            i++;
        }
    }

    public static void markRow(int arr[][], int r) {
        int m = arr.length;

        int j = 0;

        while (j < m) {
            if (arr[r][j] != 0) {
                arr[r][j] = 0;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 1 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = -1;
                    arr[0][j] = -1;
                }
            }
        }

        // traverse coluns
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i] == -1) {
                markColumn(arr, i);
            }
        }
        // traverse rows
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == -1) {
                markRow(arr, i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }
    }

}
