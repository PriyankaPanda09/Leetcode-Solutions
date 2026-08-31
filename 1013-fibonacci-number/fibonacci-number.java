// using dynamic programming
class Solution {
    public int f(int n,List<Integer> dp){
        if(n<=1){
            return n;
        }
        if(dp.get(n) != -1){
            return dp.get(n);
        }
        int ans=  f(n-1,dp) + f(n-2,dp);
        dp.set(n,ans);

        return ans;
    }
    public int fib(int n) {
        List<Integer> dp = new ArrayList<>();
        
        // initialize dp with -1
        for(int i=0;i<=n;i++){
            dp.add(-1);
        }
        return f(n,dp);
    }
}