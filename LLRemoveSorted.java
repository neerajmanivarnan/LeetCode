import java.util.HashMap;

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
        HashMap<Integer,Integer> newMap = new HashMap<>();

        int NewCount = 0;


        ListNode current = head;
        while(current!= null){
            if(newMap.containsKey(current.val)){
                int count = newMap.get(current.val);
                count = count+1;
                newMap.put(current.val, count);
            }else{
                newMap.put(current.val, 0);
            }

            current = current.next;
        }
        

        
    }
}