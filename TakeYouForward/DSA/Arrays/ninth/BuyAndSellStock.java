public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int sellIndex=0;

        int maxDifference=0;
        int minimal = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if ((prices[i]>minimal) && ((prices[i]-minimal)>maxDifference)) {
                maxDifference = prices[i]-minimal;
                sellIndex = i;
            }
            if (prices[i]<minimal) {
                minimal=prices[i];
            }
        }
        
        System.out.println("Buy stock at"+minimal+" and sell at "+ prices[sellIndex]);
    }
}