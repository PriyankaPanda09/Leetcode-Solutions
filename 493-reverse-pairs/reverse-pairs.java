class Solution {
    public int reversePairs(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length);
        int n =  arr.length;
        
        //array with less than 2 value cant form a pair
        if(n<2) return 0;

        return mergeSort(arr,0,n-1);
    }

    //count reverse pairs while sorting the selected range
    private int mergeSort(int[] arr, int left ,int right){
        if(left>=right) return 0;

        int mid = (left + right)/2;
        int pairs = 0;

        pairs += mergeSort(arr,left,mid);
        pairs += mergeSort(arr,mid+1,right);
        pairs += countCrossPairs(arr,left,mid,right);
        mergeSortedHalves(arr,left,mid,right);

        return pairs;
    }
    private int countCrossPairs(int[] arr,int left,int mid,int right){
        int pairs = 0;
        int rightPointer = mid + 1;

        //count how many right halves values are valid for each left- half value.
        for(int leftpointer=left ; leftpointer<=mid ; leftpointer++){
            long leftValue = arr[leftpointer];
            while(rightPointer <= right && leftValue > 2L * arr[rightPointer]){
                rightPointer++;
            }

            pairs += rightPointer - (mid+1);
        }
        return pairs;
    }

    //merge 2 sorted halves into one sorted range
    private void mergeSortedHalves(int[] arr, int left , int mid , int right){
        int[] merged = new int[right - left + 1];
        int first = left ;
        int second = mid+1;
        int write = 0;

        //merge the smaller available value from thr 2 halves
        while ( first <= mid && second <= right){
            if(arr[first] <= arr[second]){
                merged[write] = arr[first];
                first++;
            }else{
                merged[write] = arr[second];
                second++;
            }
            write++;
        }
        while(first<= mid){
            merged[write] = arr[first];
            first++;
            write++;
        }
        while(second<= right){
            merged[write]  = arr[second];
            second++;
            write++;
        }

        // write the merged values back into the selected range
        for(int index= 0; index< merged.length;index++){
            arr[left + index] = merged[index];
        }
    }

}






























