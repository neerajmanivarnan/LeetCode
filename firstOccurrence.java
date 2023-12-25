public class firstOccurrence {
   
    public static void main(String[] args) {
        String name  = "leetcode";
        String name1 = "leeti";
        System.out.println(strStr(name,name1));
    }
    
    public static int strStr(String haystack, String needle) {
        int num1 = haystack.indexOf(needle) ;
 
        return num1;
     }
}


class Solution {
    public int strStr(String haystack, String needle) {
       int num1 = haystack.indexOf(needle) ;

       return num1;
    }
}