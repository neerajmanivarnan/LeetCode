public class LLRemoveSorted {
    
}




 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current= head;
        ListNode prev= head;

        while(current!=null){
            if(current == prev){
                current = current.next;
                if(current.val  == prev.val){
                    current = current.next;
                    prev = prev.next;
                    head = prev;
                }else{
                    current = current.next;
                    prev = prev.next;
                }
            }else{
                if(current.val == prev.val){
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