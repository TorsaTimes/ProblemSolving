class Solution {
    public boolean isPowerOfThree(int n) {
        double d = n;
        while(d != 1){
            d = d / 3;
            if(!(d >= 1)){
                return false;
            }
        }
        return true;
    }
}
