public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        /*int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(maxProfit<prices[i]-minPrice){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;*/


        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } /*else if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }*/
            maxProfit = Math.max(maxProfit, price - minPrice);

        }
        return maxProfit;
    }
}
