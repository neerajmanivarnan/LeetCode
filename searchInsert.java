public class searchInsert {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        System.out.println(searchInsert(arr, 7));  
    }

    public static int searchInsert(int[] nums, int target) {
            int start=0;
            int end = nums.length-1;
            int mid;
            
            while(start<end){
                mid = (start+end)/2;
                if(nums[mid]==target){
                    return mid;
                }else{
                    if(nums[mid]>target){
                        end = mid-1;
                        

                    }else{
                        start = mid+1;
                    }
                }
            }

            start = 0;
            end = nums.length-1;
            int num=-1;

            while(start<end){
                mid = (start+end)/2;
                if(nums[mid]>=target){
                    num = mid;
                    
                }
                if(nums[mid]>target){
                        end = mid-1;
                    }else{
                        
                        start = mid+1;
                    }

            


            return num;
        }
}

class Solution {
        public int searchInsert(int[] nums, int target) {
            int start=0;
            int end = nums.length-1;
            int mid;
            
            while(start<end){
                mid = (start+end)/2;
                if(nums[mid]==target){
                    return mid;
                }else{
                    if(nums[mid]>=target){
                        start = mid+1;

                    }else{
                        end = mid-1;
                    }
                }
            }

            return start;
        }
}
