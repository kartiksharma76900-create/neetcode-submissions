class Solution {
    public String reverseWords(String s) {
        char chars[] = s.toCharArray();
        int start =0;
        for(int end =0; end <= chars.length;end++){
            if(end == chars.length || chars[end] == ' '){
                for( int l = start, r = end -1; l< r; l++ , r--){
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                }
                start = end +1;
            }
        }
        return new String(chars);



    }
}
