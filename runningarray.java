public class runningarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        arr = runningSum(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
    }

     public static int[] runningSum(int[] nums) {
            int i;

            for(i=1;i<nums.length;i++){
                nums[i] = nums[i] + nums[i-1];
            }
            return nums;
    }
}


class Solution {
    public int[] runningSum(int[] nums) {
            int i;

            for(i=1;i<nums.length;i++){
                nums[i] = nums[i] + nums[i-1];
            }
            return nums;
    }
}