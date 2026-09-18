class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pos=0;
        int neg = 1;
        // int cnt =0;
        // int cnt1 =0;
        for(int i=0;i<n;i++){
            if(nums[i]>0) {
                // cnt++;
                arr[pos] = nums[i];
                pos+= 2;
                }
            if(nums[i]<0){
                // cnt1++;
                arr[neg] = nums[i];
                neg+=2;
            }
            
        }
        return arr;
        // if(cnt1>cnt){
        //     for(int i =cnt;i<=n;i++){
        //         arr[cnt]=nums[i];
        //     }
        // }
        // if(cnt1<cnt){
        //     for(int i =cnt1;i<=n;i++){
        //         arr[cnt1]=nums[i];
        //     }
        // }
        
    }
}