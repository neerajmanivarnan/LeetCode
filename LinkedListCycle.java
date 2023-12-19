import java.util.HashMap;


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class LinkedListCycle{

}

 class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode pointer = head;
        int value;
        int hasCode;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        while(pointer!=null){
            hasCode = pointer.hashCode();
            value = pointer.val;
            if(newMap.containsKey(hasCode)){
                return true;
            }

            newMap.put(hasCode, value);
            pointer = pointer.next;
            
        }

        return false;
    }
}