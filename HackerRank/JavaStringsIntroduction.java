import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        if(1 < (a.compareToIgnoreCase(b))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String newA =  a.replace(a.charAt(0), (Character.toUpperCase(a.charAt(0))));
        String newB =  b.replace(b.charAt(0), (Character.toUpperCase(b.charAt(0))));
        System.out.println(a.replace(a.charAt(0), (Character.toUpperCase(a.charAt(0)))) + " " + b.replace(b.charAt(0), (Character.toUpperCase(b.charAt(0)))));
    }
}
