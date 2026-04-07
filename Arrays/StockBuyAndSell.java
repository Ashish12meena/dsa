// Given an array prices[] of length N, representing the prices of the stocks on different days,
//  the task is to find the maximum profit possible by buying and selling the stocks on different days
//  when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

// Note: Stock must be bought before being sold

//7,10,1,3,6,9

public class StockBuyAndSell {
    public static int maxProfit(int price[]) {

        // It uses nested may be it solve but time complexity is O(n^2) check second method
        int maxProfit = 0;
        for (int dayOfBuying = 0; dayOfBuying < price.length; dayOfBuying++) {
            for (int dayOfSell = dayOfBuying; dayOfSell < price.length; dayOfSell++) {
                if ((price[dayOfSell] - price[dayOfBuying]) > maxProfit) {
                    maxProfit = (price[dayOfSell] - price[dayOfBuying]);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {
                74, 78, 11, 37, 58, 90, 25, 82, 92, 48, 59, 71, 61, 66, 33, 49, 65, 88, 22, 14,
                55, 80, 94, 73, 64, 69, 35, 85, 42, 70, 95, 83, 77, 53, 91, 69, 60, 68, 96, 84,
                34, 24, 51, 63, 41, 67, 93, 97, 74, 69, 56, 61, 79, 99, 30, 38, 57, 73, 85, 94,
                18, 11, 27, 43, 52, 60, 46, 72, 98, 88, 44, 62, 81, 87, 63, 70, 93, 79, 89, 100,
                95, 82, 76, 49, 66, 47, 32, 20, 58, 36, 68, 97, 86, 91, 64, 39, 53, 75, 71, 80,
                72, 79, 22, 35, 27, 44, 67, 86, 37, 55, 31, 50, 63, 42, 66, 84, 28, 47, 59, 75,
                38, 32, 49, 45, 60, 77, 93, 61, 74, 85, 56, 31, 40, 69, 53, 62, 41, 37, 58, 82,
                91, 68, 74, 66, 44, 33, 65, 78, 84, 90, 31, 22, 47, 55, 34, 60, 81, 94, 45, 70,
                86, 93, 40, 53, 69, 58, 36, 47, 79, 99, 88, 77, 63, 66, 54, 48, 74, 93, 69, 58,
                37, 41, 66, 80, 90, 73, 51, 39, 63, 76, 88, 95, 67, 79, 84, 91, 44, 35, 50, 62,
                59, 43, 68, 70, 93, 85, 42, 33, 46, 61, 74, 87, 29, 51, 64, 78, 96, 92, 41, 36,
                67, 49, 73, 88, 61, 44, 55, 60, 76, 99, 84, 71, 69, 39, 30, 58, 46, 52, 63, 74,
                91, 83, 65, 50, 62, 77, 80, 94, 70, 66, 37, 43, 59, 85, 73, 56, 41, 33, 69, 87,
                100, 95, 60, 39, 50, 71, 79, 92, 68, 74, 48, 52, 65, 89, 77, 90, 82, 58, 67, 96
        };

        long start = System.nanoTime();
        int profit = maxProfit(prices);
        long end = System.nanoTime();
        System.out.println("Total time taken " + (end - start));
        System.out.println("max profit " + profit);
    }
}