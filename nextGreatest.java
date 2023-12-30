public class nextGreatest {
    
}


class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid ;
        char num =letters[0];

        while(start<=end){
            mid  = (start+end)/2;
            if(letters[mid] > target){
                num = letters[mid];
                end=mid-1;
                continue;
            }
            if(target>=letters[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return num;
    }
}