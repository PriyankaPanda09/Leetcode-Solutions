class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        return palin(s, 0, s.length() - 1);
    }

    public boolean palin(String s, int left, int right) {
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;
        return palin(s, left + 1, right - 1);
    }
}