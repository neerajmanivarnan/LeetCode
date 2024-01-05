import java.util.HashMap;

public class sinnum {
    
}

class Solution {
    public int singleNumber(int[] nums) {
        int number = -1;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                int count = 0;
                count = newMap.get(nums[i]);
                count+=1;
                newMap.put(nums[i],count);
            }else{
                newMap.put(nums[i], 1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(newMap.get(nums[i])==1){
                number = nums[i];
            }
        }

        return number;
    }
}
