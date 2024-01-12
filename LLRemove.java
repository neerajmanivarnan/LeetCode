public class LLRemove {
    
}


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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current= head;
        ListNode prev= head;

        while(current!=null){
            if(current == prev){
                if(current.val  == val){
                    current = current.next;
                    prev = prev.next;
                    head = prev;
                }else{
                    current = current.next;
                }
            }else{
                if(current.val == val){
                    prev.next = current.next;
                    current = current.next;
                }else{
                    prev = prev.next;
                    current=current.next;
                }
            }
        }

        return head;
  
    }
}