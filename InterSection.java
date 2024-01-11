import java.util.ArrayList;
import java.util.HashMap;

public class InterSection {
    
}

class Solution {
   
    public int[] intersection(int[] nums1, int[] nums2) {
        final ArrayList<Integer> newar = new ArrayList<>();


        
        int inter=-1;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            newMap.put(nums1[i], 0);
        } 

        for(int i=0;i<nums2.length;i++){
            if(newMap.containsKey(nums2[i])){
                inter = nums2[i];
                if(newar.contains(nums2[i])){
                    continue;
                }else{
                    newar.add(nums2[i]);
                }
                
            }
        }

        int[] n = new int[newar.size()];

        for(int i=0;i<newar.size();i++){
            n[i] = newar.get(i);
        }

        
        return n;
    }
}
