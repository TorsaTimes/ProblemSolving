/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currB = headB;
        ListNode currA = headA;
        
        List<ListNode> listOfNodesA = new ArrayList<ListNode>();
        List<ListNode> listOfNodesB = new ArrayList<ListNode>();

        while(currB != null){
            listOfNodesB.add(currB);
            currB = currB.next;
        }
        while(currA != null){
            listOfNodesA.add(currA);
            currA = currA.next;
        }
        int lenA = listOfNodesA.size();
        int lenB = listOfNodesB.size();
        if(lenA > lenB){
            int smallerIndex = 0;
            for(int i = lenA-lenB;i<lenA;i++){
                if(listOfNodesB.get(smallerIndex).equals(listOfNodesA.get(i))){
                    return listOfNodesA.get(i);
                }
                smallerIndex++;
            }
        }else if(lenB > lenA){
            int smallerIndex = 0;
            for(int i = lenB-lenA;i<lenB;i++){
                if(listOfNodesB.get(i).equals(listOfNodesA.get(smallerIndex))){
                    return listOfNodesB.get(i);
                }
                smallerIndex++;
            }
        }else{
            for(int i = 0;i<lenB;i++){
                if(listOfNodesB.get(i).equals(listOfNodesA.get(i))){
                    return listOfNodesB.get(i);
                }
            }
        }
        return null;
    }
}
