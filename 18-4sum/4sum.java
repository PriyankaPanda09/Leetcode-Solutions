/*better approach
-----------------
Time Complexity: O(N³) on average, where N represents the array size.

Space Complexity: O(N + M), where seenValues may store O(N) values and uniqueQuadruplets may store M distinct quadruplets.
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if(n<4) return new ArrayList<>();
        Set<List<Integer>> uniqueQuad = new HashSet<>();
        for(int first = 0;first<n-3;first++){
           for(int sec =first+1;sec<n-2;sec++) {
            Set<Long> seenVal = new HashSet<>();
            for(int third = sec+1;third<n;third++){
                long fourthVal = (long) target - nums[first] - nums[sec] - nums[third];
                if(seenVal.contains(fourthVal)){
                    List<Integer> quadruplet = new ArrayList<>(Arrays.asList(nums[first],nums[sec],nums[third],(int) fourthVal));
                    Collections.sort(quadruplet);
                    uniqueQuad.add(quadruplet);
                }
                seenVal.add((long) nums[third]);
            }
           }
        }
        return new ArrayList(uniqueQuad);
    }
}