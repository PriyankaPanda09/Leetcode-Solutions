class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        if(n<0) return false;/*If you use a negative exponent, it does not make the resulting number negative. Instead, it creates a positive fraction (a decimal between 0 and 1). A negative exponent simply means dividing 1 by that power of 2.
• \(2^{-1} = \frac{1}{2^1} = 0.5\)
• \(2^{-1} = \frac{1}{2^1} = 0.5\) (Positive!)
• \(2^{-2} = \frac{1}{2^2} = 0.25\) (Positive!)
• \(2^{-3} = \frac{1}{2^3} = 0.125\) (Positive!)
 */
        while(n!=0){
            n = n & (n-1);//removes the r8most 1 bit;
            count++;
        }
        return count == 1;
    }
}