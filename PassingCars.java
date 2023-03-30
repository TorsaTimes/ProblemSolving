// class Solution {
//     public int solution(int[] A) {
//         int c = 0;
//         for(int i = 0;i<A.length;i++){
//             for(int j = i+1;j<A.length;j++){
//                 if(A[i] == 0 && A[j] == 1){
//                     if(c < 1000000000){
//                         c++;
//                     }else{
//                         return -1;
//                     }
//                 }
//             }
//         }
//         return c;
//     }
// }

class Solution {
public int solution(int[] A) {
    int zero = 0;
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
