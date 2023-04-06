import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
           String s = Integer.toString(n);
           
           if(s instanceof String){
               System.out.println("Good job");
           }
           else {
               System.out.println("Good job");
           }
        } catch (Exception e){
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
