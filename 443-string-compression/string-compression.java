class Solution {
    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        int i =0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 0;
            while(i<chars.length && chars[i]==ch){
                count++;i++;
            }
            result.append(ch);
            if(count>1){
                result.append(count);
            }
        }
        for(int j=0;j<result.length();j++){
            chars[j] = result.charAt(j);
        }
        return result.length();
    }
}