public class _16_SpiralTraverslOfMatrix {
    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4, 5, 6, 7 },
        // { 18, 19, 20, 21, 22, 23, 8 },
        // { 17, 28, 27, 26, 25, 24, 9 },
        // { 16, 15, 14, 13, 12, 11, 10 } };

        int arr[][] = { { 1, 2, 3 },
         { 6, 5, 4 } };

        int horizontalLength = arr[0].length;
        int verticalLength = arr.length;

        int i = 0;
        int j = 0;

        boolean incremental = true;
        boolean isHorizontal = true;

        while (horizontalLength >= 1 && verticalLength >= 1) {
            if (isHorizontal && incremental) {
                int count = 0;
                while (count < horizontalLength) {
                    System.out.println(arr[i][j] + "   !");
                    j++;
                    count++;
                }
                j--;
                i++;
                isHorizontal = false;
                verticalLength--;
            } else if (!isHorizontal && incremental) {
                int count = 0;
                while (count < verticalLength) {
                    System.out.println(arr[i][j] + "   !");
                    i++;
                    count++;
                }
                i--;
                j--;
                isHorizontal = true;
                incremental = false;
                horizontalLength--;
            } else if (isHorizontal && !incremental) {
                int count = 0;
                while (count < horizontalLength) {
                    System.out.println(arr[i][j] + "   !");
                    count++;
                    j--;
                }
                j++;
                i--;
                isHorizontal = false;
                incremental = false;
                verticalLength--;
            } else if (!isHorizontal && !incremental) {
                int count = 0;
                while (count < verticalLength) {
                    System.out.println(arr[i][j] + "   !");
                    count++;
                    i--;
                }
                j++;
                i++;
                isHorizontal = true;
                incremental = true;
                horizontalLength--;
            }
        }

    }
}
