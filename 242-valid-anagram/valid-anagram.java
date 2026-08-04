import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var counter = new HashMap<Character , Integer>();
        for(int i=0 ; i<s.length() ; i++){
            counter.put(s.charAt(i),counter.getOrDefault(s.charAt(i),0)+1);
        }
        for ( int i = 0 ; i <t.length(); i++){
            char c = t.charAt(i);
            if(counter.getOrDefault(c,0)>0){
                counter.put(c,counter.getOrDefault(c,0)-1);
            }
            else return false;
        }
        return true;
    }
}