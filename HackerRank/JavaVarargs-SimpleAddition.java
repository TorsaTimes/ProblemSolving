

// Write your code here
class Add{
    public void add(Integer... values){
        int res = 0;
        String out = "";
        for(int i = 0;i<values.length;i++){
            res = res + values[i];
            if (i == values.length - 1){
                out = out + Integer.toString(values[i]) + "=" + res;
            }else {
                out = out + Integer.toString(values[i]) + "+";
            }
            
        }
        System.out.println(out);
    }
}

