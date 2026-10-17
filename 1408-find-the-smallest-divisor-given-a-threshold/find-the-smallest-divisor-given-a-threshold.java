//optimal approch
class Solution {
    private boolean canDivideWithinThreshold(int[] nums, int divisor,int threshold){
        long total = 0;
        for(int i : nums){
            total += (i+divisor-1L)/divisor;
            if(total > threshold) return false;
        }
        return total <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int totalSum =0;
        int low = 1;
        int high = 0;
        for(int i : nums){
            totalSum+= i;
            high = Math.max(i, high);
        }
        //if threshold >= total sum,divisor 1 is sufficient
        //if(totalSum <= threshold) return 1;

        //if threshold equals array lenght thren each num must contributr 1
        //if(threshold== nums.length) return high;
        while(low < high){
            int mid = low + (high-low)/2;
            if(canDivideWithinThreshold(nums,mid,threshold)){
                //if mid works ,try to find an even small divisor
                high = mid;
            }else {
                //if mid fails every small divisor will also fail
                low = mid + 1;
            }
        }
        return low;
    }
}