import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        if(a.length() >= 1 && b.length() >= 1 && !(a.length() != b.length())){
          
        b = b.toLowerCase();
        a = a.toLowerCase();
        
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        
        for(int i = 0;i<arrA.length;i++){
            innerLoop:for(int y = 0;y<arrB.length;y++){
                if((arrA[i]) == (arrB[y])){
                    //write in arrA and arrB on index i,y = null                
                    arrA[i] = '\0';
                    arrB[y] = '\0';
                    break innerLoop;    
                }else{
                    continue;
                }
            }
        }
        boolean r = Arrays.equals(arrA, arrB);
        
        if(r){
            System.out.println("Anagrams");
        }else{
            if(a.equals(b)){
               System.out.println("Anagrams"); 
            }else{
                System.out.println("Not Anagrams");
            } 
        }
        }
        else{
               System.out.println("Not Anagrams");
           }
    }
}
