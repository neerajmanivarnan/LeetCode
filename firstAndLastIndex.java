

public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,7,8};
        int[] newArr = searchRange(arr, 5);
        for(int i =0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        int start = 0;
        int end = nums.length-1;
        int mid; 
       

        //for the first occurence
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                ans[0] = mid;
                end = mid-1;
            }else{
                if(target>nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

         start = 0;
         end = nums.length-1;
        //second occurence
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                ans[1] = mid;
                end = mid+1;
            }else{
                if(target>nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return ans;
    }

   
}
