public class _18_DrawPascalTriangle {
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        // 1 6 15 20 15 6 1

        int n = 7;

        int prev[] = new int[n];

        for (int i = 0; i < n; i++) {
            int curr[] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr[j] = 1;
                }else{
                    curr[j] = prev[j]+prev[j-1];
                }
            }

            printArray(curr);

            System.out.println();

            prev = curr;
        }

    }
}
