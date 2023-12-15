public class CERecursion1 {
    
}

class Solution2 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int[] arr = new int[2];
            int count1=0;
            int count2=0;

            boolean newVal = false;

            caller2(nums1, nums2, 0, 0)
            caller2(nums2, nums1, 0, 0)

            for(int i=0;i<n;i++){
                newVal = caller2(nums1, nums2, 0, 0)
                if(newVal){
                    count1=count1+1;
                }
            }

            for(int i=0;i<m;i++){
                newVal = caller(nums2[i],nums1,0);
                if(newVal){
                    count2=count2+1;
                }
            }

            arr[0] = count1;
            arr[1] = count2;

            return arr;


    }

   

    public boolean  caller(int num, int[] nums2,int start) {
        if(   start == nums2.length-1 ){
            if( num == nums2[start]){
                
                return true;
            }else{
                return false;
            }
        }else{
            if(num == nums2[start]){
                return true;
            }else{
                return caller(num,nums2,start+1);
            }
            
        }
    }

    public boolean  caller2(int[] nums1, int[] nums2,int ar1,int ar2) {
        if(   ar2 == nums2.length-1 || ar1 == nums1.length-1 ){
            if( nums1[ar1] == nums2[ar2]){
                
                return true;
            }else{
                return false;
            }
        }else{
            if(nums1[ar1] == nums2[ar2]){
                return true;
                //return caller2(nums1,nums2,ar1+1)
            }else{
                 caller2(nums1,nums2,ar1,ar2+1);
                return caller2(nums1,nums2,ar1+1,ar2);
                
            }
            
        }
    }
}
