class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n/3;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int candidate = nums[i];
            int frequency =0;
            for(int j=0;j<n;j++){
                if(nums[j]==candidate) frequency++;
            }
            if(frequency>threshold && !ans.contains(candidate)) ans.add(candidate);
            if(ans.size()==2) break;//because no 3rd value can occur more than 1/3rd of the time
        }
        return ans;
    }
}