import java.io.*;
import java.util.*;

public class Solution {
    
    public static void solveMeFirst(int x, int y){
        if((1 <= x && x <= 1000) && (1 <= y && y <= 1000)){
            System.out.println(x+y);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    
    solveMeFirst(a,b);
    
    }
}
