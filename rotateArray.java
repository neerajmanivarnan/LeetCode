/* 0,1,2,3,4,5,6
 * 1,2,3,4,5,6,7
 * 
 * 
 * 
 * 
 */

class rotateArray {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +":"+ i);
        }
    }

    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k%(size);
        int left = 0;
        int right = nums.length-1;
        int temp;


        while(left<right){
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }

        left = 0;
        right = k-1;

        while(left<right){
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }

        left = k;
        right = nums.length-1;

        while(left<right){
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }



    }
}