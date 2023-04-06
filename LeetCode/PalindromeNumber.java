class Solution {
     public boolean isPalindrome(int x) {
        String str1 = Integer.toString(x); 
        for (int i = 0; i < str1.length(); i++) {
            for (int y = (str1.length()-1) - i; y >= 0; y--) {        
                if (str1.charAt(i) == str1.charAt(y)){
                    break;       
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
