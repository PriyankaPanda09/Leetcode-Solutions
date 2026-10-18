class Solution {
    private boolean checkSum(int[] nums, int k,int sum){
        int subarrays = 1;
        int consecutiveSum = 0;
        for(int i : nums){
            if(consecutiveSum + i > sum){
                subarrays++;
                if(subarrays > k) return false;
                consecutiveSum = i;
            }else{
                consecutiveSum += i;
            }
        }
        return subarrays<= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        for(int i : nums){
            low = Math.max(low,i);
            high += i;
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(checkSum(nums,k,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}