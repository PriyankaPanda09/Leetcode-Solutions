class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int right =0;
        long windowSum=0;
        int maxFrequency = 0;
        for (right =0;right<nums.length;right++){
            windowSum += nums[right];
            int windowSize = right - left +1;
            long cost = (long) windowSize * nums[right] - windowSum;

            //calculate cost
            while(cost > k ){
            windowSum -= nums[left];
            left++;

            windowSize = right - left +1;
            cost = (long)windowSize * nums[right] - windowSum;
            }
            maxFrequency = Math.max(maxFrequency, windowSize);
        }
        return maxFrequency;
    }
}