public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String r = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
        int b = 0;
        char[] arr = r.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if((arr[i] - 48) == 1){
                b++;
            }
        }
        return b;
    }
}
