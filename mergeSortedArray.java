public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(arr1,m,arr2,n);

        System.out.println(arr1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m ,j=0;i<nums1.length;i++,j++){
            nums1[i] = nums2[j];
        }
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m ,j=0;i<nums1.length;i++,j++){
            nums1[i] = nums2[j];
        }
    }

    for(int i=0;i<nums1.length;i++){
        for(int j=0;j){

        }
    }

}
