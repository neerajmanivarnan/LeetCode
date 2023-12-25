import java.util.Arrays;
import java.util.HashMap;

public class ProductofArrayExcept {

    public static void main(String[] args) {
        int[] newAr  = {1,2,3,4};
        int[] newAr1  = new int[newAr.length];

        newAr1 = productExceptSelf(newAr);
        
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
  


}

class Solution {
    public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] n1 = new int[n];
            returnArray(nums,0,n1);

            

            //HashMap<Integer,Integer> newMap = new HashMap<>();
            for(int i=0;i<nums.length;i++){
               n1[i] =  returnNewAr(nums,i);
            }

            return n1;

    }

    public static int returnNewAr(int[] nums, int i) {
        int numsResult=1;
        for(int j=0;j<nums.length;j++){
            if(i==j){
                continue;
            }

            numsResult = numsResult*nums[i];

        }
        return numsResult;
    }

    public void returnArray(int[] nums,  int i, int[] n1) {
        if(i>=nums.length){
            return;
        }else{
            int numresult = 1;
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                numresult = numresult*nums[j];
            }
            n1[i] = numresult;
            returnArray(nums, i+1, n1);

        }
    }
}
