public class _18_FindPascalValueByRowColumn {
    public static int calculate(int row, int col){
        int r = Math.min(col,row-col);
        int newCol = r;
        int denominator =1;
        int numerator =1;
        for (int i = 0; i < r; i++) {
            numerator = numerator*(row-i);
            denominator = denominator*(newCol-i);
        }

        return (numerator)/(denominator);
    }

    public static void main(String[] args) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        // 1 6 15 20 15 6 1

        int row = 20;
        int column = 10;


        System.out.println();

        System.out.println(calculate(row-1, column-1));
    }
}