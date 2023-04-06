import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    
    
    
//      public static void miniMaxSum(List<Integer> arr) {
//     // Write your code here
//         int fNum = (arr.size())-1;
//         BigInteger res = BigInteger.valueOf(0);
//         //BigInteger res = new BigInteger("0");
        
//         BigInteger max = BigInteger.valueOf(0);
//         BigInteger min = BigInteger.valueOf(0);
        
//         for(int i = 0;i<=fNum;i++){
//             for(int y = 0;y<=fNum;y++){
//                 if(i == y){
//                     continue;
//                 }
//                 else{
//                     BigInteger temp = BigInteger.valueOf(arr.get(y));
//                     res = res.add(temp);
                    
//                 }
//             }
//             int boolMax;
//             int boolMin;
            
//             boolMax = res.compareTo(max);
//             boolMin = res.compareTo(min);
            
//             if (min.compareTo(BigInteger.ZERO) == 0){
//                 min = res;
//             }
            
//             if(boolMax == 1){
//                 max = res;
//             }
//             else if(boolMin == -1){
//                 min = res;
//             }

//             res = BigInteger.valueOf(0);
//         }
//         System.out.println(min + " " + max);
//     }

// }


    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min = Long.MAX_VALUE;
    long max = 0;
    for(int i = 0;i<arr.size();i++){
        long temp = 0;
        for(int j = 0;j<arr.size();j++){
            if(j != i){
                temp += arr.get(j);
            }
        }
        if(temp < min){
            min = temp;
        }
        if(temp > max){
            max = temp;
        }   
    }
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
