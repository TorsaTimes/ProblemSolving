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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    
    public static void staircase(int n) {
    // Write your code here
    
    String res = "";
    int numbersOfHashtags = n;
    int numbersOfSpaces = 1;
    
    for(int i = 1;i<=n;i++){
        
        // define whitespaces and hashtags
        numbersOfSpaces = 1;
        
        for(int y = 1;y<=n;y++){
            if(y < numbersOfHashtags){
                res = res + ' ';
            }
            else if(y >= numbersOfHashtags){
                res = res + '#';
            }
        }
        numbersOfHashtags = numbersOfHashtags - 1;
        //print 
        System.out.println(res);
        res = "";
        
        
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
