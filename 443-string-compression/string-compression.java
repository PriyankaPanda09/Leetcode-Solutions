class Solution {
    public int compress(char[] chars) {
     //optimal solutions using read and write pointer
     // read - reads each group of identical character
     //write - writes compress characters into original array
     int read = 0;
     int write = 0;
     int n = chars.length;

     while(read < n)   {
        char ch = chars[read];
        int count = 0;
        while(read < n && chars[read]==ch){
            read++;
            count++;
        }
        chars[write]= ch;
        write++;
        if(count>1){
            String digit = String.valueOf(count);
            for(int i =0;i<digit.length();i++){
                chars[write] = digit.charAt(i);
                write++;
            }
        }
     }
     return write;
    }
}