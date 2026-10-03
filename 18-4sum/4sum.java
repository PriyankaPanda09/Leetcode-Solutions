class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(n<4) return new ArrayList<>();
        Arrays.sort(nums);
        for(int first = 0;first<n-3;first++){
            if(first>0 && nums[first]==nums[first-1]) continue;
            for(int sec=first +1;sec<n-2;sec++){
                if(sec>first+1 && nums[sec]==nums[sec-1]) continue;
                int left = sec+1;
                int right= n-1;
                while(left<right){
                    long sum = (long) nums[first] + nums[sec] + nums[left] + nums[right];
                    if(sum<target){
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        List<Integer> quad = new ArrayList<>(Arrays.asList(nums[first],nums[sec],nums[left],nums[right]));
                        Collections.sort(quad);
                        ans.add(quad);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]== nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}