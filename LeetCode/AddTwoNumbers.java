
//   Definition for singly-linked list.
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode res = ln;
        int sum = 0;
        while(l1 != null || l2 != null){

            if(l1 != null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            ln.next = new ListNode(sum % 10);
            ln = ln.next;

            if(sum > 9){
                sum = 1;
            }else{
                sum = 0;
            }

        }

        if(sum >= 1){
            ln.next = new ListNode(sum);
        }

        return res.next;

        
    }
}
