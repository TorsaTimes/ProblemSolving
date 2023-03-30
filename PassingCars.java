class Solution {
    public int solution(int[] A) {
        int c = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[i] == 0 && A[j] == 1){
                    if(c < 1000000000){
                        c++;
                    }else{
                        return -1;
                    }
                }
            }
        }
        return c;
    }
}
