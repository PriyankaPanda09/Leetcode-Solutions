class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n > 0){
            int lastbit = n & 1;
            int nextbit = (n >> 1) & 1;
            if (nextbit == lastbit){
                return false;
            }
            n = n>>>1; // >>> shifts right and fill the left bits with 0s
        }
        return true;
    }
}