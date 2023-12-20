import java.util.HashMap;

public class validAnagram {

    public static void main(String[] args) {
        String letter = "aacc";
        String letter2 = "ccac";
        System.out.println(isAnagram(letter, letter2));
    }

    public static boolean isAnagram(String s, String t) {
        String newS = s.toLowerCase();
        String newT = t.toLowerCase();
        HashMap<String,Integer> newMap = new HashMap<>();
        String letter;
        int countVal;
        int len1 = newS.length();
        int len2 = newT.length();
        if(len1!=len2){
            return false;
        }
        for(int i=0;i<newS.length();i++){
            letter = newS.charAt(i)+"";
            if(newMap.containsKey(letter)){
                countVal = newMap.get(letter);
                countVal+=1;
                newMap.put(letter, countVal);
            }else{
                newMap.put(letter, 0);
            }
        }

        for(int i=0;i<newT.length();i++){
            letter = newT.charAt(i)+"";
            if(newMap.containsKey(letter)){
                countVal = newMap.get(letter);
                if(countVal>0){
                    countVal-=1;
                    newMap.put(letter, countVal);
                }else{
                    newMap.remove(letter);
                }
                
            }
        }

        return newMap.isEmpty();
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> newMap = new HashMap<>();
        String letter;
        for(int i=0;i<s.length();i++){
            letter = s.charAt(i)+"";
            newMap.put(letter, i);
        }

        for(int i=0;i<t.length();i++){
            letter = t.charAt(i)+"";
            if(!newMap.containsKey(letter)){
                return false;
            }
        }

        return true;
    }
}
