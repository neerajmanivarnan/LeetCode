
import java.io.*;
import java.util.*;

class greaterThanZeroException extends Exception{
    public greaterThanZeroException(String msg){
        super(msg);
    }
}

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num>100){
                throw new greaterThanZeroException("The number is greater than 100");
            }
        }
        int[] arr = new int[num];

        int sum = 0;

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<num;i++){
            sum = sum + arr[i];
            // arr[i] = sc.nextInt();
        }

        if(sum >=0){
            System.out.println("Happiee!");
        }else{
            System.out.println("Oh No!");
        }


    }
}