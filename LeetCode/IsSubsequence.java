class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean[] res = new boolean[s.length()];
        int x = 0;
        if((s.length() == 0 && t.length() != 0)
            || (s.length() == 0 && t.length() == 0)){
            return true;
        }
        for(int i = 0;i<s.length();i++){
            int o = x;
            loop2:for(int j = o;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    res[i] = true;
                    if(j+1 > t.length()){
                        return false;
                    }
                    x = j + 1;
                    break loop2;
                }
            }
        }
        for(int j = 0;j<res.length;j++){
            if(!(res[j])){
                return false;
            }
        }
        return res[0];
    }
}
