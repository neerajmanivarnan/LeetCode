import java.util.HashMap;
import java.util.StringTokenizer;


/*  0,1,2,3,4,5,6,7
 * {1,2,3,4,5,6,7,8}
 * 
 * 
 * 
*/


public class wordPatt {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        // String NewString = "dog";
        // String NewToken = "dog";

        //System.out.println(NewString.equals(NewToken));

    }
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;

        HashMap<Character, String> hashtable = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String word = arr[i];

            if (hashtable.containsKey(c1)) {
                if (!hashtable.get(c1).equals(word)) return false;
            } else {
                if (hashtable.containsValue(word)) return false;
                hashtable.put(c1, word);
            }
        }

        return true;
    }
  
}



class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<String,String> newMap = new HashMap<>();

        if(arr.length!=pattern.length()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            String character  = pattern.charAt(i)+"";
            String word = arr[i]; 

            if(newMap.containsKey(character)){
               if(!newMap.get(character).equals(word)){
                return false;
               }
            }else{
                if(newMap.containsValue(word)){
                    return false;
                }
                newMap.put(character, word);
            }

            

            

        }

        return true;


    }
}

/*class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<String,String> newMap = new HashMap<>();

        if(arr.length!=pattern.length()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            String character  = pattern.charAt(i)+"";
            String word = arr[i]; 

            if(newMap.containsKey(character)){
               if(!newMap.get(character).equals(word)){
                return false;
               }
            }else{
                if(newMap.containsValue(word)){
                    return false;
                }
                newMap.put(character, word);
            }

            

            

        }

        return true;


    }
}*/


