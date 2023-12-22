import java.util.HashMap;

public class containsduplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> newMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                return true;
            }else{
                newMap.put(nums[i], 0);
            }
        }

        return false;

    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> newMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                return true;
            }else{
                newMap.put(nums[i], 0);
            }
        }

        return false;

    }
}

/*
 * class Solution {
    public boolean isIsomorphic(String s, String t) {

        // char[] arr1= s.toCharArray();
        // char[] arr2= t.toCharArray();

        //Arrays.sort(arr1);
        //Arrays.sort(arr2);

        // boolean ret =true;

        // int len1=arr1.length;
        // int len2=arr2.length;

        HashMap<String,String> map=new HashMap<>();
        String c1;
        String c2;
        
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            c1 = s.charAt(i)+"";
            c2 = t.charAt(i)+"";

            if(map.containsKey(c1))
            {
               if(!map.get(c1).equals(c2))
               {
                //    ret=false;
                //    break;
                return false;
               }
            }
            else{
                if(map.containsValue(c2)){
                    return false;
                }
                map.put(c1,c2);
            } 
             

        }

        return true;

        
    }
}
 * 
 * 
 */
