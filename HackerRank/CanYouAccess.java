import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
         Object o; // Must be used to hold the reference of the instance of the class S                 Solution.Inner.Private
        o = new Inner().new Private();
        System.out.println(t + " is " + ((Solution.Inner.Private) o).powerof2(t));
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }
    static class Inner {
        class Private{
            public String powerof2(int x){
            while(x%2==0)
            {
            x=x/2;
            }
            if(x==1){return "power of 2";}
            else {return "not a power of 2";}
        }
        }  
    }
}
