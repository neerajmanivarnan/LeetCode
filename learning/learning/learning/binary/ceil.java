package learning.learning.binary;

public class ceil {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,14,16,17,18};
        System.out.println(ceiling(arr, 1));

        System.out.println("Floor is "+floor(arr, 15));
    }



    public static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid ;
        int num =-1;

        while(start<=end){
            mid  = (start+end)/2;
            if(arr[mid] >= target){
                num = arr[mid];
                end=mid-1;
                continue;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return num;

    } 

    public static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid ;
        int num =-1;

        while(start<=end){
            mid  = (start+end)/2;
            if(arr[mid] <= target){
                num = arr[mid];
                end=mid+1;
                continue;
            }
            if(target>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return num;

    } 

}
