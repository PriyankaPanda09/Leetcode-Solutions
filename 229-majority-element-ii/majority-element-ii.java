//using hashmap (better approach)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            if(entry.getValue()>threshold){
                ans.add(entry.getKey());
            }
            if(ans.size()==2) break;
        }
        return ans;
    }
}