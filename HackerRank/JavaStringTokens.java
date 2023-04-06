import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    List<String> list = new ArrayList<String>();
    String delimiters = "\\s|,\\s*|\\.\\s*|-\\s*|\\.\\s*";
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine().trim();
    if(input.isEmpty()){
            return;
        }

        String[] newData = input.split("[ ,!?._'@]+");
        for(String s : newData){
            System.out.println(s);
        }
        
    }
    
    
    
}
