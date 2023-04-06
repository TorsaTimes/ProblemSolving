class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll(
          "[^a-zA-Z0-9]", "");
        r = r.toLowerCase();
        int y = r.length()-1;
        if(r == ""){
            return true;
        }
        for(int i = 0;i<r.length();i++){
            if(!(r.charAt(i) == r.charAt(y))){
                return false;
            }
            y--;
        }
        return true;
    }
}
