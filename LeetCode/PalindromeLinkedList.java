/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode p = p1; // 2
        p1 = p1.next; // 4
        p.next = null; // p next soll (4) sein ist aber null
        while(p1 != null){
            ListNode temp = p1.next;
            p1.next = p;
            p = p1;
            p1 = temp;
        }
        p2 = head;
        p1 = p;
        while(p1 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
