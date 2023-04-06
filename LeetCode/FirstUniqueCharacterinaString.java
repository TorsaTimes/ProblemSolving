class Solution {
    public int firstUniqChar(String s) {
        List<Character> p = new ArrayList<Character>();
        for(int i = 0;i<s.length();i++){
            boolean b = true;
            if(p.contains(s.charAt(i))){
                continue;
            }
            for(int j = i;j<s.length()-1;j++){
                if(s.charAt(i) == s.charAt(j+1)){
                    p.add(s.charAt(i));
                    b = false;
                    break;
            }
        
        }
            if(b){
            return i;
        }
    }
    return -1;
}
}
