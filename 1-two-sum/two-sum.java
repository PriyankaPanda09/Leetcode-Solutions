class Solution{
    public int[] twoSum(int[] nums, int target){
        var seen = new HashMap< Integer , Integer>();
        for(int i =0 ; i< nums.length ;i++){
            int complement = target - nums[i];
            if( seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            else{
            seen.put(nums[i],i);
        }
        }
        return new int[]{-1,-1};
    }
}