class Solution {
    public int reverse(int x) {
        boolean n = false;
        String s = "";
        String temp = "";
        if(x > Integer.MAX_VALUE - 1 || x < Integer.MIN_VALUE){
            return 0;
        }
        
        s = Integer.toString(x);
        if(x < 0){
            n = true;
            s = s.replace("-", ""); 
        }
        for(int i = s.length()-1;0<=i;i--){
            temp += s.charAt(i);
        } 
        long res = Long.parseLong(temp);
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;
        }
        Integer i = (int) (long) res;
        if(n){
            return (~(i - 1));
        }else{
            return i;
        }
    }
}
