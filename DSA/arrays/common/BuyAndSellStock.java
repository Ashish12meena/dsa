public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int sellIndex=0;

        // int maxDifference=0;
        // int minimal = prices[0];


        // for (int i = 1; i < prices.length; i++) {
        //     if ((prices[i]>minimal) && ((prices[i]-minimal)>maxDifference)) {
        //         maxDifference = prices[i]-minimal;
        //         sellIndex = i;
        //     }
        //     if (prices[i]<minimal) {
        //         minimal=prices[i];
        //     }
        // }


        // revision approach

        int profit =0;
        int minimal = Integer.MAX_VALUE;
        int minimalIndex=0;
        int buyIndex =0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minimal) {
                minimal = prices[i];
                minimalIndex=i;
            }else{
                if ((prices[i]-minimal)>profit) {
                    profit = prices[i]-minimal;
                    sellIndex =i;
                    buyIndex = minimalIndex;
                }
            }
        }


        
        System.out.println("Buy stock at"+prices[buyIndex]+" and sell at "+ prices[sellIndex]);
    }
}