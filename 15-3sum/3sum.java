/*
optimal approach
----------------
Time Complexity: O(N²), where N represents the array size. Sorting requires O(N log N) time, and a linear two-pointer traversal runs for every fixed index.

Space Complexity: O(1) explicit auxiliary space when the returned answer is excluded. Sorting may require implementation-dependent internal memory.
*/class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(n<3) return new ArrayList<>();
        Arrays.sort(nums);
        for(int fixed=0;fixed<n-2;fixed++){
            if(fixed>0 && nums[fixed]==nums[fixed-1]){
                continue;
            }
            int left = fixed + 1;
            int right= n-1;
            while(left <right){
                long sum = (long) nums[fixed] + nums[left]+ nums[right];
                if(sum<0) left++;
                else if(sum>0) right--;
                else{
                    ans.add(Arrays.asList(nums[fixed],nums[left],nums[right]));
                     left++;
                right--;
                
               
                while(left<right && nums[left]==nums[left-1]){left++;}
                while(left<right && nums[right]==nums[right+1]){right--;}
                }
            }
        }
        return ans;
    }
}