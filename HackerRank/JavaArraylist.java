import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-arraylist/problem

public class Solution {
    
    public static List<Integer[]> getlistOfIntegerArrays(int num, BufferedReader r, boolean b){
            List<Integer[]> res = new ArrayList<Integer[]>();
            try{
            for(int i = 0;i<num;i++){
                List<String> listTemp = new ArrayList<String>();
                String temp[] = r.readLine().split(" ");
                    if(b){
                        Integer[] intArrTemp = new Integer[temp.length-1];
                        for(int y = 1; y<temp.length;y++){
                            intArrTemp[y-1] = Integer.parseInt(temp[y]);
                        }
                        res.add(intArrTemp);
                    }
                    else{
                        Integer[] intArrTemp = new Integer[temp.length];
                        for(int y = 0; y<temp.length;y++){
                            intArrTemp[y] = Integer.parseInt(temp[y]);
                        }
                        res.add(intArrTemp);
                    }
            }
            return res;
            }catch(Exception e){
        }
        return null;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer[]> arrList = new ArrayList<Integer[]>();
        List<Integer[]> pairIntegerArrayList = new ArrayList<Integer[]>();
        
        try {
            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(System.in));
            
            arrList = getlistOfIntegerArrays(Integer.parseInt(reader.readLine()), reader, true);  
            
            pairIntegerArrayList = getlistOfIntegerArrays(Integer.parseInt(reader.readLine()), reader, false);  
            
            for(int y = 0;y<pairIntegerArrayList.size();y++){
                try {
                    int listIndex = pairIntegerArrayList.get(y)[0];
                    int arrListIndex = pairIntegerArrayList.get(y)[1];
                Integer i = arrList.get(listIndex-1)[arrListIndex-1];
                   System.out.println(i);
                }catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
        }catch(Exception e){
            //
        }
        
    }
}
