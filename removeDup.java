import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,5,6,7};
        System.out.println("Number of elelements"+removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int newArr[] = sorted(nums);
        int n = newArr.length;
        return n;
    }
    public static int[] sorted(int[] arr){
        ArrayList<Integer> name = new ArrayList<>();
        int lastVal=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == lastVal){
                continue;
            }else{
                name.add(arr[i]);
                lastVal = arr[i];
            }
        }
        int[] intArray = new int[name.size()];
        for (int i = 0; i < name.size(); i++) {
            intArray[i] = name.get(i);
        }

        System.out.println("The array is  : ");
        for(int i =0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        return intArray;
    }

}