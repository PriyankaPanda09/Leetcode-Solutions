class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        return xor;
    }
}