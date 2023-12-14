import java.util.Stack;

class rotateArray {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        Stack<Integer> s1 = new Stack<>();
        int len = nums.length;
        int start=len-k;
        int org = start;

        while(start<len){
            s1.push(nums[start]);
            start=start+1;
        }
        int i=0;
        while(i<org){
            s1.push(nums[i]);
            i=i+1;
        }
        int j=nums.length-1;
        System.out.println("j value is "+j);
        while(j>=0){
            nums[j] = s1.pop();
            j=j-1;
        }


    }
}