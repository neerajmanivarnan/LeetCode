import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<String,Integer> newMap = new HashMap<>();
        newMap.put("I",1);
        newMap.put("V",5);
        newMap.put("X",10);
        newMap.put("L",50);
        newMap.put("C",100);
        newMap.put("D",500);
        newMap.put("M",1000);

        int prev=0;
        int current;
        int val=0;
        String newChar;

        for(int i=s.length()-1;i>=0;i--){
            newChar = s.charAt(i)+"";
            current = newMap.get(newChar);
            if(prev>current){
                val = val - current;
                prev = current;
            }else{
                val = val +current;
                prev = current;
            }
        }

        return val;

    }
}

/*
 * Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/


class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> newMap = new HashMap<>();
        newMap.put("I",1);
        newMap.put("V",5);
        newMap.put("X",10);
        newMap.put("L",50);
        newMap.put("C",100);
        newMap.put("D",500);
        newMap.put("M",1000);

        int prev=0;
        int current;
        int val=0;
        String newChar;

        for(int i=s.length()-1;i>=0;i--){
            newChar = s.charAt(i)+"";
            current = newMap.get(newChar);
            if(prev>current){
                val = val - current;
                prev = current;
            }else{
                val = val +current;
                prev = current;
            }
        }

        return val;

    }
}
