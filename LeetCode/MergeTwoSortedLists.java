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

        static  ArrayList<Integer> bubbleSort( ArrayList<Integer> arr, int n)
    {            
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr.get(j-1) > arr.get(j)){  
                                 //swap elements  
                                 temp = arr.get(j-1);  
                                 arr.set(j-1, arr.get(j));
                                 arr.set(j, temp);
                         }  
                          
                 }  
         }
         return arr;
    } 

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode newList = new ListNode();
        ListNode current = newList;

        ArrayList<Integer> tempList = new ArrayList<Integer>();

        while(list1 != null || list2 != null){

            if(list1 != null){
                tempList.add(list1.val);
                list1 = list1.next;
            }
            if(list2 != null){
                tempList.add(list2.val);
                list2 = list2.next;
            }
        }
        if(tempList.isEmpty()){
            return null;
        }
        else{
            tempList =  bubbleSort(tempList, tempList.size());
        }
        for(Integer i : tempList){
            current.next = new ListNode(i);
            current = current.next;
        }
        
        return newList.next; 
    }
}
