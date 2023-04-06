import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

            // Taking integer input
            String a = br.readLine();
            String b = br.readLine();
            
            
            BigInteger bigIntegerA = new BigInteger(a);
            BigInteger bigIntegerB = new BigInteger(b);
            
            BigInteger bigIntegerAdd = bigIntegerA.add(bigIntegerB);
            BigInteger bigIntegerMultiple = bigIntegerA.multiply(bigIntegerB);
        
        }catch(Exception e){
            System.out.println(e);    
        }
    }
}
