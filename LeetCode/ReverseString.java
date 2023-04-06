class Solution {
    public void reverseString(char[] s) {
        char[] res = new char[s.length];
        int y = 0;
        for(int i = s.length-1;0<=i;i--){
            res[y] = s[i];
            y+=1;
        }
        for(int i = 0;i<res.length;i++){
            s[i] = res[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
