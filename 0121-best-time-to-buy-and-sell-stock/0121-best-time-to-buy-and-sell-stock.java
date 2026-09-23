class Solution {
    public int maxProfit(int[] prices) {
        int buy= prices[0];
        int profit=0;

        for(int i=1 ; i< prices.length ; i++){
            int dff=  prices[i]-buy;
            if(dff> profit){
                profit= dff;
            }
            if(buy>prices[i]){
                buy= prices[i];
            }
        }
        
        return profit;
    }
}