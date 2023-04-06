import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        for(int i = 0;i<n;i++){
            String m = s.nextLine();
            if(m == " " || m == "" || m == null){
                n = n+1;
                continue;
                
            }
            
            Pattern pattern = Pattern.compile("^([a-zA-Z]){1}([a-zA-Z]|\\_|\\d){7,29}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(m);
            boolean matchFound = matcher.find();
            if(matchFound){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            
        }
    }
}
