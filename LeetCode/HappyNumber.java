class Solution {

    static int powerFunction(int base, int exponent) {
       int result = 1;
       for (int i = 0; i < exponent; i++) {
           result = base * result;
       }
       return result;
   }

    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        String s = Integer.toString(n);
        int sum = 0;
        while(sum != 1 || (list.contains(sum))){
            for(char c : s.toCharArray()){
            sum += powerFunction((c - 48), 2);  
            }
            if(list.contains(sum)){
                return false;
            } else if(sum == 1){
                return true;
            }else{
                list.add(sum);
                s = Integer.toString(sum);
                sum = 0;
            }
        }
            return false;
        }
}
