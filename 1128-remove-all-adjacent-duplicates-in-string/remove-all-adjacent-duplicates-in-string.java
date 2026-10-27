//using string builder as stack
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for(int i=0;i<s.length();i++)        {
            char c = s.charAt(i);
            int size = stack.length();

            if(size > 0 && stack.charAt(size-1)==c){
                stack.deleteCharAt(size-1);
            }else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}