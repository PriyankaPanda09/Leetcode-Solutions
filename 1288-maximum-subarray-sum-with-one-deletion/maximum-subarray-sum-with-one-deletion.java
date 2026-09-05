class Solution {
    public int maximumSum(int[] arr) {

        int keep = arr[0];    // Maximum sum without deletion
        int delete = 0;       // Maximum sum with one deletion
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int previousKeep = keep;

            keep = Math.max(arr[i], keep + arr[i]);

            delete = Math.max(
                previousKeep,
                delete + arr[i]
            );

            answer = Math.max(answer, Math.max(keep, delete));
        }

        return answer;
    }
}