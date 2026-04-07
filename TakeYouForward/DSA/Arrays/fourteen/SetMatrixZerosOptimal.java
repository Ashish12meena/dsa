public class SetMatrixZerosOptimal {
    public static void markColumn(int arr[][], int c) {
        int n = arr[0].length;

        int i = 0;

        while (i < n) {
            if (arr[i][c] != 0) {
                arr[i][c] = -1;
            }
            i++;
        }
    }

    public static void markRow(int arr[][], int r) {
        int m = arr.length;

        int j = 0;

        while (j < m) {
            if (arr[r][j] != 0) {
                arr[r][j] = -1;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 1 } };

        int storeRow[] = new int[arr.length];
        int storeColumn[] = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    storeRow[i] = 1;
                    storeColumn[j] = 1;
                }
            }
        }

        for (int i = 0; i < storeRow.length; i++) {
            if (storeRow[i] != 0) {
                markRow(arr, i);
            }
        }

        for (int i = 0; i < storeColumn.length; i++) {
            if (storeColumn[i] != 0) {
                markColumn(arr, i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
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
