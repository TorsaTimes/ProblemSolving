// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static int[] setMaxCounter(int[] t, int mc){
        for(int i = 0;i<t.length;i++){
            t[i] = mc;
        }
        return t;
    }

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = Integer.MIN_VALUE;
        for(int i = 0;i<A.length;i++){
            int temp = 0;
            if(A[i] <= N && A[i] >= 1){
                temp = counters[A[i]-1] + 1;
                counters[A[i]-1] = temp;
                if(temp > maxCounter){
                    maxCounter = temp;
                }
            }else if(A[i] == N+1){
                counters = setMaxCounter(counters, maxCounter);
            }
        }
        return counters;
    }
}
