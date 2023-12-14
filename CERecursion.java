public class CERecursion {
    
}

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int[] arr = new int[2];
            int count1=0;
            int count2=0;

            for(int i=0;i<n;i++){
                if(caller(nums1[i],nums2,0,0)>0){
                    count1=count1+1;
                }
            }

            for(int i=0;i<m;i++){
                if(caller(nums2[i],nums1,0,0)>0){
                    count2=count2+1;
                }
            }

            arr[0] = count1;
            arr[1] = count2;

            return arr;


    }

    public int  caller(int num, int[] nums2,int start,int count) {
        if(   start == nums2.length-1 ){
            if( num == nums2[start]){
                count = count+1;
                return count;
            }else{
                //count=count+1;
                return count;
            }
        }else{
            if(num == nums2[start]){
                count = count+1;
                return caller(num,nums2,start+1,count);
            }else{
                return caller(num,nums2,start+1,count);
            }
            
        }
    }
}
