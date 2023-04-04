import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static List<Integer> getlistOfIntegerArrays(int num, BufferedReader r){
            List<Integer> res = new ArrayList<Integer>();
            try{
                String temp[] = r.readLine().split(" ");
                for(int i = 0;i<num;i++){
                    res.add(Integer.parseInt(temp[i]));
                }
                return res;
            }catch(Exception e){
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();
        
        try {
            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(System.in));
            
            arrList = getlistOfIntegerArrays(Integer.parseInt(reader.readLine()), reader);
            
            int n = Integer.parseInt(reader.readLine());
            for(int y = 0;y<n;y++){
                try {
                    String s = reader.readLine();
                    if(s.matches("Insert")){
                        String temp[] = reader.readLine().split(" ");
                        int t = Integer.parseInt(temp[0]);
                        int o = Integer.parseInt(temp[1]);
                        arrList.add(t,o);
                    } 
                    if(s.matches("Delete")){
                        int j = (Integer.parseInt(reader.readLine()));
                        arrList.remove(j);
                    }
                    
                }catch(Exception e){
                }
            }
  
        }catch(Exception e){
        }
        
        for(int i = 0;i<arrList.size();i++){
                System.out.print(arrList.get(i) + " ");
        }
    }
}
