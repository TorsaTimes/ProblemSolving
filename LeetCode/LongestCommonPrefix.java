class Solution {

    public String longestCommonPrefix(String[] strs) {   
        if(strs.length == 1){
            return strs[0];
        }     
        List<String> prefix = new ArrayList<String>();
        String sub = strs[0];
        String r = "";
        loop1:for(int i = 0;i<sub.length();i++){
            String temp = "";
            for(int j = 1;j<strs.length;j++){
                if(i < strs[j].length()){
                    if(sub.charAt(i) == strs[j].charAt(i)){
                        temp = String.valueOf(sub.charAt(i));
                        continue;   
                    }else{
                        break loop1;
                    }
                }else{
                    break loop1;
                }
            }
            r += temp;
        }
        return r;
}
}
