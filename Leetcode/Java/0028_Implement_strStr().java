class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        } else {
            int i, j;
            for (i = 0; i < haystack.length() - needle.length() + 1; i++) {
                for(j = 0; j < needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                }
                if(j == needle.length()){
                    return i;
                }
            }
            return -1;
        }
    }
}