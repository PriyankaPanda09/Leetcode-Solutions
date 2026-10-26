//method 1 - directly remove rightmost 1 bit
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}