class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> presum = new HashMap<>();
        int prefixSum =0;
        int count =0;
        presum.put(0,1);
        for(int i =0;i<n;i++){
            prefixSum+= nums[i];
            int remove = prefixSum -k;
            if(presum.containsKey(remove)){
                count+= presum.get(remove);
            }
            presum.put(prefixSum,presum.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}