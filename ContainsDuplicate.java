import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};

        //[0,1,2,3,4,0,0,7,8,9,10,11,12,0]
//1
    int k = 1;
   // System.out.println(containsNearbyDuplicate({1,0,1,1},1));
    boolean value = containsNearbyDuplicate(arr,k);

    System.out.println(value);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                count = count+i;
            }
            newMap.put(nums[i], i);
        }

        if(count<=k){
            return true;
        }else{
            return false;
        }

    }

}

// class Solution {
//     public static boolean containsNearbyDuplicate(int[] nums, int k) {
//         int count =0;
//         int num1=0;
//         int num2=0;

        
//         HashMap<Integer,Integer> newMap = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(newMap.containsKey(nums[i])){
//                 num1 = newMap.get(nums[i]);
//                 num2  = i;
//             }
//             newMap.put(nums[i], i);
//         }

//         count = Math.abs(num1-num2);

//         if(count<=k){
//             return true;
//         }else{
//             return false;
//         }

//     }
// }
