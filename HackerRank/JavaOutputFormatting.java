import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String intPadded = "";
        String r = "";
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int stringLength = 14-s1.length();
                int x=sc.nextInt();
                for (int o = 0;o<=stringLength;o++){
                    s1= s1 + " ";
                }
                //Complete this line
                if (String.valueOf(x).length() <= 2){
                    intPadded = String.format("%03d" , x);
                    System.out.println(s1 + intPadded);
                }else {
                     System.out.println(s1 + x);
                }
               
            }
            System.out.println("================================");

    }
}



