class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;

            //check if left part is sorted
            if(nums[low]<= nums[mid]){
                //update ans with the min value
                ans = Math.min(ans,nums[low]);

                // move to the right part
                low = mid + 1;
            }else{
                // upadate the ans with min of ans and nums[mid]
                ans = Math.min(ans,nums[mid]);

                //move to the left part
                high = mid -1 ;
            }
        }
            return ans;
    }
}