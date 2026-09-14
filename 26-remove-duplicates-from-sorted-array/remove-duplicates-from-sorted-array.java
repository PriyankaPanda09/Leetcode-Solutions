class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> expectedNums = new TreeSet<>();
        // here the question demands the result to be sorted in scending order only
        // but hashSet doesnot gurantee soreted order so we use treeSet which gurantee sorted order.
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
    // tc : NlogN + N;
    // sc : N
    // we can minimize the time complexity by o(N) and sc by o(1) using 2 pointers
}