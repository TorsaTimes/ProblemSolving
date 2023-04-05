class Solution {

    public static int[] getBinaryArray(String n, int[] a){
        char temp = ' ';
        boolean flag = true;
        
        for(int i = 0;i<n.length();i++){

            if(n.charAt(i) != temp){
                temp = n.charAt(i);
                if(flag){
                    a[i] = 1;
                    flag = false;
                }
                else{
                    a[i] = 0;
                    flag = true;
                }
                }else{
                    a[i] = a[i-1];
                }
            }
            return a;
    }

    public boolean isIsomorphic(String s, String t) {
        
        int len = 0;
        if(s.length() != t.length()){
            return false;
        }
        else{
            len = s.length();
        }

        int[] sArr = new int[len];
        int[] tArr = new int[len];

        sArr = getBinaryArray(s, sArr);
        tArr = getBinaryArray(t, tArr);

        if(Arrays.equals(sArr, tArr)){
            return true;
        }
        else{
            return false;
        }
    }
}
