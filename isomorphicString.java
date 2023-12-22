import java.util.HashMap;

public class isomorphicString {
    
}

/**
 *  
 */
class Solution{
    public static boolean isomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;

        HashMap<String, String> hashtable = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String c1 = s.charAt(i)+"";
            String c2 = t.charAt(i)+"";

            if (hashtable.containsKey(c1)) {
                if (!hashtable.get(c1).equals(c2)) return false;
            } else {
                if (hashtable.containsValue(c2)) return false;
                hashtable.put(c1, c2);
            }
        }

        return true;
    }
}