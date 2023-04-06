import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String test = s.nextLine();
        int c = 0;
        Pattern pattern = Pattern.compile("hackerrank");
        
        for (String word : test.split(" ")) {
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()) {
                c++;
            }
        }
    }
}
