package learning.learning.binary;

public class ceil {
    
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        //System.out.println(ceiling(letters, 1));

        //System.out.println("Floor is "+floor(letters, 15));

        //System.out.println(nextGreatestLetter(letters,'a'));
    }


    

    public static int ceiling(int[] letters,int target){
        int start = 0;
        int end = letters.length-1;
        int mid ;
        int num =-1;

        while(start<=end){
            mid  = (start+end)/2;
            if(letters[mid] >= target){
                num = letters[mid];
                end=mid-1;
                continue;
            }
            if(target>letters[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return num;

    } 

    public static int floor(int[] letters,int target){
        int start = 0;
        int end = letters.length-1;
        int mid ;
        int num =-1;

        while(start<=end){
            mid  = (start+end)/2;
            if(letters[mid] <= target){
                num = letters[mid];
                end=mid-1;
                continue;
            }
            if(target>letters[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return num;

    } 

}




