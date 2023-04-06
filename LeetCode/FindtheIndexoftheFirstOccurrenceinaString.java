class Solution {
    public int strStr(String haystack, String needle) {
        int l = needle.length();
        int l2 = haystack.length();

        for(int r = 0;r<= l2-l;r++){
            for(int i = 0;i<l;i++){
                if(needle.charAt(i) != haystack.charAt(r+i)){
                    break;
                }
                if(i == l - 1){
                    return r;
                }

            }
        }
        return -1;
    }
}
