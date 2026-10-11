class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]== target) return mid;
            //check weather left half is normally sorted
            if(nums[low] <= nums[mid]){
                //the target lies inside the sorted left half 
                if(nums[low] <= target && target< nums[mid]){
                    high = mid -1;
                }else{
                    //target must lie in the other half
                    low= mid +1;
                }
            }
            else{
                //the left is not sorted , so the right half must be sorted
                if(nums[mid]< target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    //target msut lie in the other half
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}