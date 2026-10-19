//Optimal Approach
class Solution {
    // finds the median by binary searching the partition btn the left half and the right half
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Binary search should run on the smaller array
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n = nums1.length;
        int m = nums2.length;

        //this is how many elements must stay in the left half
        int leftSize = (n + m + 1)/2;

        int low = 0;
        int high = n;

        while(low <= high){
            //cut1 means how many elements are taken from nums1
            int cut1 = low + (high - low)/2;

            //cut2 fills the remaining left-half positions from the nums2.
            int cut2 = leftSize - cut1;

            //if cut1 is at the start, nums1 has no left value.
            int left1 = (cut1 == 0)? Integer.MIN_VALUE : nums1[cut1 - 1];

            //if cut1 is at the end, nums1 has no right value .
            int right1 = (cut1 == n)? Integer.MAX_VALUE : nums1[cut1];

            //if cut2 is at the start, nums2 has no left value.
            int left2 = (cut2 == 0)? Integer.MIN_VALUE : nums2[cut2 - 1];

            //if cut2 is at the end, nums2 has no right value .
            int right2 = (cut2 == m)? Integer.MAX_VALUE : nums2[cut2];

            //this condition means all the left values are small enough.
            if(left1 <= right2 && left2 <= right1){
                //if total length is odd, the median is the larger value from the left side.
                if((n+m) % 2 ==1){
                    return Math.max(left1,left2);
                }else{
                    //for even we return avg 
                    return ((double) Math.max(left1 ,left2) + Math.min(right1,right2))/2.0;
                }
            }else if (left1 > right2){
                //too many elements were taken from nums1, so move its cut towards the left 
                high = cut1 - 1;
            }else{
                // too few elements were taken from nums 1, so move cut1 toward right 
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}