class Solution {
    public int maxProfit(int[] prices) {
        int buy= prices[0];
        int profit=0;

        for(int i=0 ;i<prices.length; i++ ){
            int df= prices[i]- buy;
            if(df>0) profit+=df;
            buy=prices[i];
        }
        return profit;
    }
}