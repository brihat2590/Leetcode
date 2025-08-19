class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        if (n == 0) return 0;

       
        int buy1 = -prices[0];   // after first buy
        int sell1 = 0;           // after first sell
        int buy2 = -prices[0];   // after second buy
        int sell2 = 0;           // after second sell

        for (int i = 1; i < n; i++) {
            
            buy1 = Math.max(buy1, -prices[i]);          
            sell1 = Math.max(sell1, buy1 + prices[i]);  
            buy2 = Math.max(buy2, sell1 - prices[i]);   
            sell2 = Math.max(sell2, buy2 + prices[i]);  
        }
        return sell2;

        
    }
}