// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int zero = 0;
        int one = 0;
        int sum = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i] == 0){
                zero++;
            }
            else{
                if(sum < 1000000000){
                    sum += zero * 1;
                }else{
                    return -1;
                }
            }
        }
        return sum;
    }
}
