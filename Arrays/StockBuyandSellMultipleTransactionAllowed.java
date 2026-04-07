public class StockBuyandSellMultipleTransactionAllowed {
   public static int findMaxProfit(int prices[]){
        int maxProfit =0;
        int aquire = 0;
        int sell= 0;

        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1]>prices[i]) {
                if (aquire==0) {
                    aquire=prices[i];
                }
            }
            if (prices[i+1]<prices[i]) {
                if (aquire>0) {
                    sell=prices[i];
                    maxProfit=maxProfit+(sell-aquire);
                    aquire=0;
                    sell=0;
                }
            }
        }
        if (aquire>0) {
            maxProfit = maxProfit + (prices[prices.length-1]-aquire);
        }
        
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {4, 2, 2, 2, 4};
        int maxProfit =findMaxProfit(prices);
        System.out.println("Max profit is : "+maxProfit);
    }
}
