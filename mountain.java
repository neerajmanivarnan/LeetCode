public class mountain {

    public static void main(String[] args) {
        int[] arr= {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid=-1;
        while(start<end){
            mid = (start+end)/2;
            
            if(arr[mid]>arr[mid+1]){
                
                
                end = mid;
            }else{
                start=mid+1;
            }
        }

        
        return start;
    }
}



class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        int index=-1;
        while(start<end){
            mid = (start+end)/2;
            int sep = arr[mid];
            index = mid;
            if(sep>arr[mid+1]){
                end = mid;
            }else{
                start=mid;
            }
        }

        return index;
    }
}