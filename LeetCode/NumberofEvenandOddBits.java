class Solution {
    public int[] evenOddBit(int n) {
        String result = Integer.toBinaryString(n);
        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(result);
  
        // reverse StringBuilder input1
        input1.reverse();
        
        int even = 0;
        int odd = 0;
        int c = 0;
        System.out.println(result);
        for(int i = 0;i<input1.length();i++){
            if(input1.charAt(i) == '1'){
                 if(i % 2 == 0){ 
                     System.out.println(input1.charAt(i)  + " " + i + " is even");
                even += 1;
            }
            else{
                System.out.println(input1.charAt(i) + " " + i + " is odd");
                odd += 1;
            }
            
            }
        }
        return new int[]{even,odd};
    }
}
