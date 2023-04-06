import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static boolean isOdd(int x){
        if(x % 2 == 0){
            return false;
        }else {
            return true;
        }
    }
    
    static boolean isPrime(int x){
        int count = 0;
        for(int i = 1;i<=x;i++){
            if(x % i == 0){
                count++;      
            }
        }
        if(count == 2){
            return true;
        }else {
            return false;
        }  
    }
    
    static boolean isPalindrome(int x){
        int r,sum=0,temp;    
        temp=x;    
        while(x>0){    
            r=x%10;  //getting remainder  
            sum=(sum*10)+r;    
            x=x/10;    
        }    
        if(temp==sum){return true;}   
        else{return false;}    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i = 1;i<=t;i++){
            int testCaseNum = scan.nextInt();
            int checkNum = scan.nextInt();
                        
            switch(testCaseNum){
                case 1:
                if(Solution.isOdd(checkNum) == true){
                    System.out.println("ODD");
                }else {
                   System.out.println("EVEN"); 
                }
                    break;
                case 2:
                    if(Solution.isPrime(checkNum) == true){
                    System.out.println("PRIME");
                    }else {
                    System.out.println("COMPOSITE"); 
                    }
                    break;
                case 3:
                    if(Solution.isPalindrome(checkNum) == true){
                    System.out.println("PALINDROME");
                    }else {
                    System.out.println("NOT PALINDROME"); 
                    }
                    break;
                
            }
            
        }
        
        
    }
}
