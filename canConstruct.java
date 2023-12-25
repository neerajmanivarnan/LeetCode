import java.util.HashMap;

public class canConstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String,Integer> newMap = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            String name = ransomNote.charAt(i)+"";
            if(newMap.containsKey(name)){
                int count = newMap.get(name);
                count+=1;
                newMap.put(name, count);
            }else{
                newMap.put(name, 1);
            }

        }

        for(int j=0;j<magazine.length();j++){
            String name = magazine.charAt(j)+"";
            if(newMap.containsKey(name)){
                System.out.println(newMap.get(name));
                int count = newMap.get(name);
                
                    count-=1;
                    if(count<=0){
                        newMap.remove(name);
                        continue;
                    }
                    newMap.put(name, count);
                
                
            }
        }
        
        
        return newMap.isEmpty();
}
}


