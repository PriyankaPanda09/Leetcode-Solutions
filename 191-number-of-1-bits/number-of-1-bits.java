//method 2 - remove last bit and check wether it is 1 or not 
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0)        {
            count += (n&1);
            n= n>>1;
        }
        return count;
    }
}