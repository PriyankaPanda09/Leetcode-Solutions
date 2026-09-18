class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int miniPrice = prices[0];
        int maxProfit =0;
        for(int i =0;i<n;i++){
            int profit = prices[i]-miniPrice;
            maxProfit = Math.max(maxProfit,profit);
            miniPrice = Math.min(miniPrice,prices[i]);
        }
        return maxProfit;
    }
}
// tc : o(n2) sc o(1)