public class Solution {
    static int powerFunction(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
        int sum = 0;
        for(int j = s.length()-1;0<=j;j--){
            sum += (s.charAt(j) - 48) * powerFunction(2, j);
        }
        return sum;
    }
}
