public class _18_PrintEntireRowOfPascalOptimal {
    public static void main(String[] args) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        // 1 6 15 20 15 6 1

        // you have to print 6th row
        int r = 6;

        int result = 1;
        int numerator = 1;
        int denominator = 1;

        for (int i = 0; i < r; i++) {
            if (i == 0 || i == r - 1) {
                System.err.print(1 + " ");
            } else {
               result = result * (r-i)/i;
               System.out.print(result+" ");
            }
        }
    }
}
