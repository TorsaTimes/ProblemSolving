class Solution {
    public int romanToInt(String s) {
            int resultNumber = 0;
        int[] arr = new int[s.length()];
        List<Integer> r = new ArrayList<Integer>();
        for(int i = 0;i <= s.length()-1;i++){
            switch (s.charAt(i)) {
                case 'I':
                  arr[i] = 1;
                  break;
                case 'V':
                arr[i] = 5;
                  break;
                case 'X':
                arr[i] = 10;
                  break;
                case 'L':
                arr[i] = 50;
                  break;
                case 'C':
                arr[i] = 100;
                  break;
                case 'D':
                arr[i] = 500;
                  break;
                case 'M':
                arr[i] = 1000;
                  break;
               default: ;
          }
        }

        for (int i = 0;i<arr.length;++i){
            int current = arr[i];
 
            loop: for(int y = i+1;y<=arr.length; y++){
            if (y >= arr.length){
                y = i;
            }    
            int next = arr[y];

            if(current < next){
                switch (current) {
                    case 1:
                        if (next == 5 || next == 10){
                            r.add((~(current - 1)));
                            break loop;
                        }
                    case 10:
                    if (next == 50 || next == 100){
                        r.add((~(current - 1)));
                        break loop;
                    }
                    case 100:
                    if (next == 500 || next == 1000){
                        r.add((~(current - 1)));
                        break loop;
                    }
                    default: break;
                }
            }
            else if(current > next){
                r.add(current);
                break;
            }
            else {
                r.add(current);
                break;
            }
        }
    }

            for (int ele : r){
                resultNumber = resultNumber + ele;
            }
            return resultNumber;
        
    }
}
