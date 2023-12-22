import java.util.Arrays;
import java.util.Stack;

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
        int startIndex = nums.length-k;
        int[] newArr2 = new int[k];
        int[] newArr1 = new int[nums.length-k];

        
        

        for(int i=startIndex,j=0;i<nums.length;i++,j++){
            
            newArr2[j] = nums[i];
        }
         

        for(int i=0,j=0;i<startIndex;i++,j++){
            newArr1[j] = nums[i];
        }

         

        for(int i=0;i<newArr2.length;i++){
            nums[i] = newArr2[i];
        }

        for(int i=startIndex-1,j=0;i<nums.length;i++,j++){
            
            nums[i] = newArr1[j];
        }


    }
}