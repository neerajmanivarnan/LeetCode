import java.util.StringTokenizer;

// public class LastWord {
    
// }
public class LastWord {
    public static int lengthOfLastWord(String s) {
        String newString = s;
        StringTokenizer tokenizer = new StringTokenizer(newString);
        String token="hello";

        while(tokenizer.hasMoreTokens()){
            token = tokenizer.nextToken();
        }
        int length = token.length();
        return length;
    }

   

}