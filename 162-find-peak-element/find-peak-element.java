//Brute Force Approach
class Solution {
    public int findPeakElement(int[] nums) {
        //a single element is always a peak 
        if(nums.length == 1) return 0;
        for (int i =0;i<nums.length;i++){
            //check if first element using only the right neighbour
            if(i==0){
                if(nums[i]>nums[i+1]) return i;
            }
            else if(i==nums.length-1){
                //check the last element using only the left neighbour
                if(nums[i] > nums[i-1]) return i;
            }
            else{
                // a middle element is a peak only if it is greater than both sides
                if(nums[i]> nums[i-1] && nums[i]>nums[i+1]) return i;
            }
        }
        return -1;
    }
}