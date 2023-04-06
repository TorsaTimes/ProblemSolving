import java.io.*;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
      
        Pattern p = Pattern.compile("^...\\....\\....\\....$");
        Matcher m = p.matcher(s);
        boolean matchFound = m.find();
        
        if(matchFound){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
      
    }
}
