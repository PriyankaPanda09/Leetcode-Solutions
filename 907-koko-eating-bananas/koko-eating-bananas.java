class Solution {
    private boolean canFinish(int[] piles,int speed,int h){
        int hours = 0;
        for(int pile:piles){
            hours += (pile + speed -1)/speed;//for calculating the ceil value;
            if(hours > h) return false;
        }
        return hours<= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans =0;
        for(int pile:piles){
            high = Math.max(high,pile);
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(canFinish(piles,mid,h)){
                // ans = mid;
                high = mid;
            }else low = mid + 1;
        }
        return low;
    }
}