class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Always binary search on the smaller array for O(log(min(m,n)))
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int half = (total + 1) / 2; // size of left partition (handles odd/even)

        int lo = 0, hi = m;

        while (lo <= hi) {
            int cut1 = (lo + hi) / 2;      // elements taken from nums1
            int cut2 = half - cut1;        // elements taken from nums2

            // Values just around the cut points
            int left1  = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int left2  = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                // Valid partition found
                if (total % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                hi = cut1 - 1; // took too much from nums1, move left
            } else {
                lo = cut1 + 1; // took too little from nums1, move right
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}