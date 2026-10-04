class Solution {
    public int[][] merge(int[][] intervals) {
        //step 1 : sort by starting point
        Arrays.sort(intervals,(a,b)->{
            if(a[0] != b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });
        List<int[]> merged = new ArrayList<>();

        //step 2 :process every inteval
        for(int[] interval:intervals){
            // If there is no previous interval 
            if(merged.isEmpty() || interval[0] > merged.get(merged.size()-1)[1]){
                 merged.add(new int[]{interval[0], interval[1]});
            }
            //or there is no overlap
             else {

                // There is overlap
                int[] last = merged.get(merged.size() - 1);

                last[1] = Math.max(last[1], interval[1]);
            }
        }
         return merged.toArray(new int[merged.size()][]);
    }
}