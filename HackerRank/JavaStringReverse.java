import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean b = false;
        /* Enter your code here. Print output to STDOUT. */
        loop1:for(int i = 0;i<A.length();i++){
            for(int y = (A.length()-1)-i;y >= 0;y--){
                if(A.charAt(i) == A.charAt(y)){
                    b = true;
                    break;
                }
                else{
                    b = false;
                    break loop1;
                }
            }
        }
        if(b){
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



