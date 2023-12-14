import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> newList = new ArrayList<>();
        String word;
        for(int i=0;i<words.length;i++){
            word = words[i];
            if(word.contains(String.valueOf(x))){
                newList.add(i);
            }
        }
        return newList;
    }
}