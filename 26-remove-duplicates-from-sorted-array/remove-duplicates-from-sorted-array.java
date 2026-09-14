//two pointer approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j =1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
            return i+1;
            // tc : O(N);
            // sc : O(1);
    }
}