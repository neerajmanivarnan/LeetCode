public class deleteMiddleNode {
    
}



  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        ListNode newone=head;

        if(head.next == null){
            head =null;
            return head;
        }
        
        while(fp!=null &&fp.next!=null){
            if(fp==sp){
                sp = sp.next;
                fp = fp.next.next;
                
            }else{
                sp = sp.next;
                fp = fp.next.next;
                newone = newone.next;
            }
        }

        newone.next = sp.next;

        return head;

    }
}
