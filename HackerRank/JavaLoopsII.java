import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int q = scanner.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        for(int y = 0;y<q;y++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
            // proceed
            int base = (a + 1 * b);
            int stepFormula = 0;
            String ws = " ";
            String builder = String.valueOf(base) + ws;
            
            for (int i = 1;i<=n-1;i++){
                // formula
               
                base = base + (((int) Math.pow(2, i)) * b);
                 if(i==n-1){
                    builder = builder + String.valueOf(base) + "";
                }
                else{
                    builder = builder + String.valueOf(base) + ws;
                }
                
            }
            System.out.println(builder);
        }
        
        scanner.close();
}
}
