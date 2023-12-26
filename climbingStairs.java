public class climbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int[] arr = new int[n];
        for(int i =1;i<=n;i++){
            arr[i] = newStairs(i);
        }

        return arr[n];

        
    }
    public static int newStairs(int n) {
        if(n == 1 || n==0){
            return 1;
        }else{
            return newStairs(n-1) + newStairs(n-2);
        }
    }
}


class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n==0){
            return 1;
        }else{
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
