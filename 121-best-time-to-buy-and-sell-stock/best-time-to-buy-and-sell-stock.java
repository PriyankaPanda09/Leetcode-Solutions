class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minprice=Integer.MAX_VALUE;
        for(int i: prices){
            if(i<minprice){
                minprice = i;
            }else{
                int profit = i-minprice;
            maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}