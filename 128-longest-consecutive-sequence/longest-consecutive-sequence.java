class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);//sort the array in ascending order
       int lastsmaller = Integer.MIN_VALUE;
       int cnt =0;
       int longest = 1;
       for(int i =0;i<n;i++){
        if(nums[i]-1 == lastsmaller){
            cnt++;
            lastsmaller = nums[i];
        }
        else if(nums[i]!=lastsmaller){
            cnt = 1;
            lastsmaller = nums[i];
        }
        longest = Math.max(longest,cnt);
       }
       return longest;
    }
}