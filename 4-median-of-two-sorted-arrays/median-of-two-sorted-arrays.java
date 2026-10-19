//Better Approach
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // these ptrs track the next unused value in each array.
        int i=0;
        int j =0;
        // previous and current store the last two picked values.
        int previous =0;
        int current = 0;

        //only positions up to the middle can affect the median
        int middle = (n+m)/2;

        for(int count =0;count<= middle;count++){
            previous = current;

            //if both arrays still have values, choose the smaller one.
            if(i<n && j<m){
                //nums1 is choosen when it has the smaller current value.
                if(nums1[i] <= nums2[j]){
                    current = nums1[i];
                    i++;
                }else{
                    //nums2 is choosen bcz its current value is smaller
                    current = nums2[j];
                    j++;
                }
            }
            else if(i<n){
                //nums2 is finished, so the next value must come from nums1
                current = nums1[i];
                i++;
            }else{
                // nums1 is finished, so the next value must come from nums2.
                current = nums2[j];
                j++;

            }
        }
        //if total is odd , current is the exact middle value
        if((n+m) %2 ==1){
            return current;
        }else{
            //is total is even,previous and current are the 2 middle values.
            return ((double) previous + current)/ 2.0;
        }
    }
}