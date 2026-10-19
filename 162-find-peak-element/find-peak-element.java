//Optimal Approach
class Solution {
    // return the index of any valid peak element
    public int findPeakElement(int[] nums) {
        // left boundary of the current search range
        int low = 0;
        //right boundary of the current search range
        int high = nums.length-1;

        //keep shrinking the search range until one peak postion remaining
        while(low<high){
            //calculate the middle index safely
            int mid = low + (high - low)/2;

            // a rising slope means some peak must exist on the r8 side
            if(nums[mid]<nums[mid+1]){
                low = mid + 1;
            }else {
                // a flling slop means mid or the left side contains a peak
                high = mid ;
            }
        }
        return low;
    }
}