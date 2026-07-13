class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0,max=0;
        for(int i=1;i<=prices.length-1;i++)
        {
           mini= Math.min(prices[i],mini);
           profit=prices[i]-mini;
           max=Math.max(max,profit);
        }
        return max;
    }
}
