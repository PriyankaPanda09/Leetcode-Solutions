class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> ans = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans.get(ch)==1) return i;
        }
        return -1;
    }
}