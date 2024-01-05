import java.util.HashMap;

public class finddifference {
    
}

class Solution {

    //https://leetcode.com/problems/find-the-difference/

    public char findTheDifference(String s, String t) {
        HashMap<String,Integer> newMap = new HashMap<>();
        String c1;
        int count;
        for(int i =0;i<s.length();i++){
            c1 = s.charAt(i)+"";
            if(newMap.containsKey(c1)){
                count = newMap.get(c1);
                count+=1;
                newMap.put(c1, count);
            }else{
                newMap.put(c1,1);
            }
        }

        char c2 = 'a';
        for(int i =0;i<t.length();i++){
            c2 = t.charAt(i);
            c1 = c2+"";
            if(newMap.containsKey(c1)){
                count = newMap.get(c1);
                if(count == 1){
                    newMap.remove(c1);
                }else{
                    count-=1;
                newMap.put(c1, count);
                }
                
            }else{
                break;
                
            }
        }
        return c2;

    }
}
