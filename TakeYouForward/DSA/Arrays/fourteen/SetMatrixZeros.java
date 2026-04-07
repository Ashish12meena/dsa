public class SetMatrixZeros {
    public static void markMinusOneApartfromZero(int arr[][], int p, int q) {
        int m = arr.length;
        int n = arr[0].length;

        int i = 0;
        
        while (i<m) {
            if (arr[i][q]!=0) {
                arr[i][q]=-1;
            }
            i++;
        }
        
        int j = 0;

        while (j<n) {
            if (arr[p][j]!=0) {
                arr[p][j]=-1;
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
                    if (arr[i][j]==0) {
                        markMinusOneApartfromZero(arr, i, j);
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j]==-1) {
                       arr[i][j]=0;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                   System.out.print(arr[i][j]+" ,");
                }
                System.out.println();
            }


            


    }

}
