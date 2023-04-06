//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int res = 0;
        if (n > 1000){
            return 0;
        }
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                res=res+i;
            }
        }
        return res;
    }
}
