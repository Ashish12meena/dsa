public class MissingandRepeatingNumberMathOptimal {
    public static int sumOfNNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int sumOfNNumbersSquares(int n) {
        return (n * (n + 1) * ((2 * n) + 1)) / 6;
    }

    public static void main(String[] args) {

        int missing = -1;
        int repeating = -1;

         int x;  // x = missing - repeating
        int y;  // y = missing + repeating

        int arr[] = { 4, 3, 6, 2, 1, 1 };

        int arrSum = 0;

        int arrSumSquare = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
            arrSumSquare = arrSumSquare + (arr[i] * arr[i]);
        }

        x = sumOfNNumbers(arr.length) - arrSum;

        y = (sumOfNNumbersSquares(arr.length) - arrSumSquare) / x;

        missing = (x + y) / 2;

        repeating = missing - x;

        System.out.println(missing);
        System.out.println(repeating);

    }
}
