import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String res = "";
        for(int i = 0;i<S.length();i++){
            if(i >= start && i <= end - 1){
                res = res + S.charAt(i);
            }
        }
        System.out.println(res);
    }
}
