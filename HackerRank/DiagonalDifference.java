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

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
         Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.ALL);
        
     int listElementLenght = ((arr.get(0)).size()) - 1;
     
     int ltr = 0;
     int rtl = listElementLenght;
     
     int ltrRes = 0;
     int rtlRes = 0;

     for(List<Integer> innerArr : arr){
         
        ltrRes = ltrRes + innerArr.get(ltr);
        rtlRes = rtlRes + innerArr.get(rtl);

        if(ltr <= listElementLenght && rtl >= 0){
            ltr++;
            rtl--;
        }else {
            break;
        }
     }
     if(ltrRes > rtlRes){
                   logger.info(ltrRes - rtlRes + " ERG");
                return ltrRes - rtlRes;
                }
                else if (rtlRes > ltrRes){
                    return rtlRes - ltrRes;
                }
                else{
                    return 0;
                }
        
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
