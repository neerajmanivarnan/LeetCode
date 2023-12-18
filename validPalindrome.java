public class validPalindrome {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        String name1 = name.toLowerCase();
        String name2 = name1.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(name2);

       //System.out.println(isPalindrome(name));

    }

    public static boolean isPalindrome(String s) {
        String new1 = s.toLowerCase();
        String new2 = new1.replaceAll("[^a-zA-Z0-9]", "");
        int i;
        int j;
        i = 0;
        j = new2.length()-1;
        while(i!=j){
            char one = new2.charAt(i);
            char two = new2.charAt(j);
            if(one!=two){
                return false;
                
            }else{
                i++;
                j--;
            }

        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int i;
        int j;
        i = 0;
        j = s.length()-1;
        while(i!=j){
            char one = s.charAt(i);
            char two = s.charAt(j);
            if(one!=two){
                return false;
                
            }else{
                i++;
                j--;
            }

        }
        return true;
    }
}
