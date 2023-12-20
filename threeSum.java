import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> newList = new ArrayList<>();
        boolean newList1;
        //List<List<Integer>> newList1 = new ArrayList<>();
        HashMap<Integer,Integer> newMap = new HashMap<>();
        int i,j,k;
        int sum;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        newList1 = newList.add(List.of(nums[i],nums[j],nums[k]));

                        newMap.put(newList.hashCode(), i);
                        
                    }
                }
            }
        }
        // Set<List<Integer>> setOfLists = new HashSet<>(newList);
        // return new ArrayList<>(setOfLists);

        System.out.println(newMap);

        return getDistinctLists(newList);
    }

    



    public static List<List<Integer>> getDistinctLists(List<List<Integer>> listOfLists) {
        List<List<Integer>> distinctLists = new ArrayList<>();

        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i< listOfLists.size();i++){
            List<Integer> first = listOfLists.get(i);
            for(int j = 0;j<first.size();j++){

            }
        }

        return distinctLists;
    }
    }



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> newList = new ArrayList<>();
        int i,j,k;
        int sum;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        newList.add(List.of(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return newList;
    }
}