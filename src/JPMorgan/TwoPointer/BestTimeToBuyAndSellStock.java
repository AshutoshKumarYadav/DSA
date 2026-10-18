package JPMorgan.TwoPointer;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is: " + maxProfit(prices));
        System.out.println("Index of Maximum Profit is: " + maxProfitIndex(prices));
        System.out.println("Maximum Profit using Kadane's Algorithm is: " + maxProfitKadane(prices));

    }
    public static int maxProfit(int[] prices){
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            } else if (maxProfit<prices[i]-minPrices) {
                maxProfit = prices[i]-minPrices;
            }
        }
        return maxProfit;
    }















    public static int maxProfitIndex(int[] prices){
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        int maxProfitIndex = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            } else if (maxProfit<prices[i]-minPrices) {
                maxProfit = prices[i]-minPrices;
                maxProfitIndex = i;
            }
        }
        return maxProfitIndex;
    }

    // By Using Kadanes Algorithm
    public static int maxProfitKadane(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
}
