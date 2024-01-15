public class reverseLL {
    
}




 
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
 class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=head;
        ListNode current=head;
        ListNode nxt=head;

        if(prev == current){
            current = current.next.next;
            prev = prev.next;
            nxt = nxt.next;
        }

        
    }
}