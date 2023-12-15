// 

import java.util.HashMap;

public class majorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int num = ME(arr);

        System.out.println(num);
    }

    public static int ME(int[] nums) {
        HashMap<Integer,Integer> newMap = new HashMap<>();
        int num = -1;

        int maxFreq=0;
        int maxVal=-1;
        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                num = newMap.get(nums[i]);
                num = num+1;
                newMap.put(nums[i], num);
            }else{
                newMap.put(nums[i], 1);
            }
        }

        for(Integer Mapper : newMap.values()){
            if(Mapper>maxFreq){
                maxFreq = Mapper;
            }
        }

        maxVal = getKeyByValue(newMap, maxFreq);
        
        return maxVal;
        
    }

    private static <K, V> K getKeyByValue(HashMap<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (map.get(key).equals(value)) {
                return key;
            }
        }
        return null; // Value not found in the map
    }

    
}

class Solution1 {
    
}
