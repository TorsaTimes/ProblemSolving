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
import static java.util.Map.entry; 

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        
    boolean am = false;
    boolean pm = false;
    String res = "";
    String[] newData = s.split(":");
 
    if((newData[newData.length-1]).contains("AM")){
        newData[newData.length-1] = (newData[newData.length-1]).substring(0, newData.length - 1);
        am = true;
        
    }else if((newData[newData.length-1]).contains("PM")){
        newData[newData.length-1] = (newData[newData.length-1]).substring(0, newData.length - 1);
        pm = true;
    }else{
        return "";
    }
    int placeholder = 0;
    
    if(am){
        placeholder = Integer.parseInt(newData[0]);
        if(placeholder == 12){
            newData[0] = "00";
        }            
    }else if(pm){
        placeholder = Integer.parseInt(newData[0]);
        if(placeholder < 12){
            newData[0] = Integer. toString(placeholder + 12);
        }        
    }
    for(int i = 0;i<newData.length;i++){
            if(i<newData.length-1){
               res+= newData[i] + ":";
            }else{
                res+= newData[i];
            }
        }
    return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
