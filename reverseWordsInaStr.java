public class reverseWordsInaStr {
    public static void main(String[] args) {
        String name = " Neeraj Mani ";
        ;
        System.out.println((reverseWords(name)));
    }

    public static String reverseWords(String s) {
        s =  s.trim();
        String newName="";
        String[] newArr = s.split(" ");
        String[] newArr1 = new String[newArr.length];

        for(int i = newArr.length-1,j=0;i>=0;i--,j++){
            newArr1[j] = newArr[i];
        }

        for(int i=0;i<newArr.length;i++){
            newName = newArr1[i]+" ";
        }

        

        return newName;
    }
}

class Solution {
    public String reverseWords(String s) {
        s =  s.trim();
        String[] newArr = s.split(" ");
        String[] newArr1 = new String[newArr.length];

        for(int i = newArr.length-1,j=0;i>=0;i--,j++){
            newArr1[j] = newArr[i];
        }
        

        return newArr1.toString();
    }
}
