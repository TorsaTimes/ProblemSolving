import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 1;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String n = scan.nextLine();
            if (n != ""){
                System.out.println(count + " " + n);
                count++;
            }
        }
    }
}
