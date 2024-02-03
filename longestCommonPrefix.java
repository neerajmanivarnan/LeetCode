import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
        // Arrays.sort(strs);
        // System.out.println(Arrays.toString(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index = 0;
        while(index < first.length() && index < last.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return first.substring(0,index);
        
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];
        String changingWord;
        String appended="";
        for(int i=1;i<firstWord.length();i++){
            // changingWord = strs[i];
            for(int j=0;j< strs.length;j++){
                if(strs[j].charAt(i-1) != firstWord.charAt(i-1)){
                    break;
                }
                appended = appended+firstWord.charAt(j);
            }
        }
        
        return appended;
    }
}