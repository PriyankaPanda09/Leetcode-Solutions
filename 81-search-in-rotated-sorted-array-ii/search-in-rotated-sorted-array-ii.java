class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            //target is found at middle position
            if(nums[mid] == target) return true;

            //duplicate at both end hide which half is sorted. check for duplicate and remove them
            if(nums[low]== nums[mid] && nums[mid]== nums[high]){
                low++;
                high--;
            }
            //left half is normally sorted
            else if(nums[low]<= nums[mid]){
                //target lies in the sorted left half
                if(nums[low]<= target && target<nums[mid]){
                    high = mid -1;
                }//target lies in the other half
                else{
                    low = mid +1 ;
                }
            }
            //right half must be normally sorted here.
            else{
                if(nums[mid] < target && target<= nums[high]){
                    low = mid + 1;
                }
                else{
                    //the target must lie in the other half
                    high = mid -1;
                }
            }
        }
        return false;
    }
}