class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int count1= 0;
        int count2=0;
        for(int value : nums){
            if(value == candidate1) count1++;
            else if(value== candidate2) count2++;
            else if(count1 == 0) {
                candidate1= value;
                count1++;
            }
            else if(count2==0){
                candidate2 = value;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int verified1 = 0;
        int verified2 =0;

        for(int value:nums){
            if(value == candidate1){
                verified1++;

            }
            else if(value == candidate2){
                verified2++;
            }
        }
        int threshold = nums.length/3;
        List<Integer> ans = new ArrayList<Integer>();

        if(verified1 >threshold){
            ans.add(candidate1);
        }
        if(verified2>threshold && candidate2!= candidate1){
            ans.add(candidate2);
        }
        return ans;

    }
}