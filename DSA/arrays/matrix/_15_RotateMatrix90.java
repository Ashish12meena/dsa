public class _15_RotateMatrix90 {
    public static void main(String[] args) {
        int matlen = 4;
        int n = matlen-1;
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int newArra[][] = new int[4][4];

        for (int i = 0; i < newArra.length; i++) {
            for (int j = 0; j < newArra.length; j++) {
                newArra[j][n - i] = arr[i][j];
            }
        }

        System.out.println();

        for (int i = 0; i < newArra.length; i++) {
            for (int j = 0; j < newArra.length; j++) {
                System.out.print(newArra[i][j] + " ,");
            }
            System.out.println();
        }
    };
}   
