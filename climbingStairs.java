public class climbingStairs {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = -1;
        }
        System.out.println(climbStairs1(5,arr));
    }
    public static int climbStairs(int n) {
        int[] arr  = new int[n+1];
        if(n<=1){
            return n;
        }
        arr[0] = 1;
        arr[1] = 1;
        for(int i =2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static int climbStairs1(int n,int[] arr) {
        if(n<=1){
            arr[n] = n;
            return n;
        }else{
            if(arr[n-1]!=-1){
                return arr[n];
            }else{
                return climbStairs1(n-1, arr) + climbStairs1(n-2, arr);
            }
        }
    }
  
}


