public class rotateBSearch {
    public static void main(String[] args) {
        int[] arr = {1};
        //System.out.println(bSearch(arr));

        System.out.println(search(arr, 1));
    }

    public static int search(int[] nums, int target) {
        int pivot = bSearch(nums);
        int start;
        int end;
        int mid=-1;
        int index = -1;

        start = pivot;
        end = nums.length-1;
            

        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else{
                if(nums[mid] > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }

        start = 0;
        end = pivot;

        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else{
                if(nums[mid] > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        
        return index;
    }

    private static  int bSearch(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid=-1;
        while(start<end){
            mid = (start+end)/2;
            if(nums[start]>nums[mid]){
                end = mid-1;
            }else{
                start = start+1;
            }
        }
        return start;
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int pivot = bSearch(nums);
        int start;
        int end;
        int mid=-1;
        if(target>nums[pivot]){
            start = pivot;
            end = nums.length;
        }else{
            start = 0;
            end = pivot;
        }

        while(start<end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }else{
                if(nums[mid] > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return mid;
    }

    private int bSearch(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid=-1;
        while(start<end){
            mid = (start+end)/2;
            if(nums[start]>nums[mid]){
                end = mid-1;
            }else{
                start = start+1;
            }
        }
        return start;
    }

}
