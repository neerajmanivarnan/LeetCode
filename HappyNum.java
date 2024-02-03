import java.util.HashMap;

public class HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappy(19)); 
    }

    public static boolean isHappy(int n) {
        HashMap<Integer,Integer> newmap = new HashMap<>();
        int num;
        int g=0;
        while(true){
            num = pt(n);
            if(num == 1){
                g=0;
                break;
            }
            if(newmap.containsKey(num)){
                g=1;
                break;
            }else{
                newmap.put(num, 0);
            }
            n = num;
        }

        if(g==0){
            return true;

        }else{
            return false;
        }
    }

    private static int pt(int n) {
        
        int rem ;
        int sum = 0;
        while(n>0){
            rem  = n%10;
            sum = sum + (rem*rem);
            n =n/10;
        }

        return sum;
    }

}


class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> newmap = new HashMap<>();
        int num;
        int g=0;
        while(true){
            num = pt(n);
            if(newmap.containsKey(num)){
                g=1;
                break;
            }else{
                newmap.put(num, 0);
            }
            n = num;
        }

        if(g==0){
            return true;

        }else{
            return false;
        }
    }

    private int pt(int n) {
        
        int rem ;
        int sum = 0;
        while(n>0){
            rem  = n%10;
            sum = sum + (rem*rem);
            n =n/10;
        }

        return sum;
    }
}