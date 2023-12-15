import java.util.HashMap;

public class twoSum {
    
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> newMap = new HashMap<>();
            int comp;
            int[] arr = new int[2];

            for(int i=0;i<nums.length;i++){
                comp = target -nums[i];
                if(newMap.containsKey(comp)){
                    arr[0] = newMap.get(nums[i]);
                    arr[1] = i;
                }
            }

            return arr;

    }
}
