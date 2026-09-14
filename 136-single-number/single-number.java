class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> arr = new HashMap<>();
        for(int i :nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:arr.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}