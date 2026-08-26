class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int i=0;  // for size
        int j= 0; // for child greed
        Arrays.sort(g); 
        Arrays.sort(s) ;
        while(i < m && j<n){
            if(g[j] <= s[i]){
                j++; 
            }
            i++;
        }
        return j;
    }
}