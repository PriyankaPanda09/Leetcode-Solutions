class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();

            for (int i = 0; i < size; i++) {
                List<Integer> newSubset =
                    new ArrayList<>(result.get(i));//copy the existing bag 

                newSubset.add(num);//drop the new num inside it
                result.add(newSubset);//put it back on the table
            }
        }

        return result;
    }
}