public class isSubSeq {
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "abc";
        System.out.println(isSubsequence(s, t));
        // Solution st = new Solution();
        // System.out.println(st.isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char c1;
        char c2;
        int index=-1;
        int c=0;
        

        for(int i=0;i<s.length();i++){
            c = 0;
            c1 = s.charAt(i);
            for(int j=index+1;j<t.length();j++)
            {

                c2 = t.charAt(j);
                if(c1 == c2){
                    
                    
                    index = j;
                    c = 1;
                    break;
                }
            }
            if(c == 0){
                return false;
            }
        }

        return true;
    }

    // public static boolean isSubsequence(String s, String t) {
    //     char c1;
    //     char c2;
    //     int index=-1;
    //     int c=0;
        

    //     for(int i=0;i<s.length();i++){
    //         c = 0;
    //         c1 = s.charAt(i);
    //         for(int j=index+1;j<t.length();j++)
    //         {

    //             c2 = t.charAt(j);
    //             if(c1 == c2){
                    
                    
    //                 index = j;
    //                 c = 1;
    //                 break;
    //             }
    //         }
    //         if(c == 0){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}


class Solution {
    public boolean isSubsequence(String s, String t) {
        char c1;
        char c2;
        int index=-1;
        int c=0;
        

        for(int i=0;i<s.length();i++){
            c = 0;
            c1 = s.charAt(i);
            for(int j=index+1;j<t.length();j++)
            {

                c2 = t.charAt(j);
                if(c1 == c2){
                    
                    
                    index = j;
                    c = 1;
                    break;
                }
            }
            if(c == 0){
                return false;
            }
        }

        return true;
    }
}