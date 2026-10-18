class Solution {
    public int findKthPositive(int[] arr, int k) {
        //search for the position where no. of missing +ve int becomes >= k;
        int low =0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            //count missing +ve int before arr[mid]
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        //after the loop , low is the num of array element before the position containg the kth missing num.
        // therefore , the kth missing +ve int is low + k;
        return low + k;
    }
}
// tc :(O(log n)), space (O(1)).