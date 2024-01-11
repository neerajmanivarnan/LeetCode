import java.util.HashMap;

public class missingNum {
    
}

class Solution {
    public int missingNumber(int[] nums) {
        int miss=-1;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            newMap.put(nums[i],0);
        }

        for(int i=1;i<nums.length;i++){
            if(newMap.containsKey(i)){
                continue;
            }else{
                miss = i;
            }
        }

        return miss;
    }
}
