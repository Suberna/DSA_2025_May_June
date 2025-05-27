package Array;
class StockBuySell{
    public int maxProfit(int[] prices) {
        int minprices = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprices){
                minprices = prices[i];
            }else{
                int profit = prices[i] - minprices;
                maxprofit = Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
        
    }
}