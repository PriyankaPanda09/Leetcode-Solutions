class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> expectedNums = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            expectedNums.add(nums[i]);
        }
        int k=0;
        for(int i: expectedNums){
            nums[k]= i;
            k++;
        }
        return k;
    }
}