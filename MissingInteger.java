// you can also use imports, for example:
// import java.util.*;
// import java.util.stream.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        boolean[] b = new boolean[A.length+1];
        if(A[A.length-1] <= 0){
            return 1;
        }
        for(int i = 0;i<A.length;i++){
            if(0 <= A[i] && (A[i] < A.length+1)){
                b[A[i]] = true;
            }
        }
        for(int i = 1; i<b.length;i++){
            if(!(b[i])){
                return i;
            }
        }
        return b.length;
    }
}
