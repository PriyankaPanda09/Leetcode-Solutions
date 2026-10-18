class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        while(true){
            boolean found = false;
            for(int x:arr){
                if(x==num){
                    found = true;
                    break;
                }
            }
            if(!found){
                k--;
                if(k==0){
                    return num;
                }
            }
            num++;
        }
    }
}