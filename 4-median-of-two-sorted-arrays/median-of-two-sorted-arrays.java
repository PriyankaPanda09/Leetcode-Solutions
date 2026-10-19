//Brute Force Approach
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //this stores all the value from both the arrays in one place
        ArrayList<Integer> merged = new ArrayList<>();
        
        for(int val : nums1){
            merged.add(val);
        }
        for(int val : nums2){
            merged.add(val);
        }

        //sorting creates the final order needed for median calculation
        Collections.sort(merged);

        //total no. of values after both arrays are combines
        int total = merged.size();

        //if total is odd, there is exact one middle  element
        if (total %2 == 1){
            return merged.get(total/2);
        }else{
            // If total is even, the median is the average of the two middle elements.
            return((double)merged.get(total/2-1)+ merged.get(total/2))/2.0;
        }
    }
}