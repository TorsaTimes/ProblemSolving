class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> d = new HashMap<Character, Character>();
        if(s.length() <= 1) return false;
        d.put('(',')');
        d.put('[',']');
        d.put('{','}');

        for(char c : s.toCharArray()){
            if(d.containsKey(c)){
                stack.add(c);
            }
            else if(stack.size() <= 0 ||d.get(stack.pop()) != c){
                return false;
            }
        }

        if(stack.size() > 0){
            return false;
        }else {
            return true;
        }
    }
}
