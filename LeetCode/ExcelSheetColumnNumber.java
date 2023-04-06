// import static java.util.Map.entry;
// class Solution {
//     public int titleToNumber(String columnTitle) {
//         Map<Character, Integer> test2 = Map.ofEntries(
//             entry('A', 1),entry('B', 2),entry('C', 3),
//             entry('D', 4),entry('E', 5),entry('F', 6),
//             entry('G', 7),entry('H', 8),entry('I', 9),
//             entry('J', 10),entry('K', 11),entry('L', 12),
//             entry('M', 13),entry('N', 14),entry('O', 15),
//             entry('P', 16),entry('Q', 17),entry('R', 18),
//             entry('S', 19),entry('T', 20),entry('U', 21),
//             entry('V', 22),entry('W', 23),entry('X', 24),
//             entry('Y', 25),entry('Z', 26)
//             );
//             int res = 0;
//             int p = 0;
//             for(int i = columnTitle.length() - 1;0<=i;i--){
//                 res+= test2.get(columnTitle.charAt(i)) * (Math.pow(26, p++));
//             }
//         return res;
//     }
// }

public class Solution {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        s = "AB";
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            int l = 'B';
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
