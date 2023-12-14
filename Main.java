

public class Main {
    public static void main(String[] args) {
        char[] s = {'P', 'a', 'r', 'u', ' ', 'I',' ', 'L', 'o', 'v', 'e', ' ', 'y', 'o', 'u'};
        //int i;
        //int j=0;
        String newString = "";

        char[] alphabetArray = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
            ' ' // Whitespace
        };
        String myNew;

        for(int i=0;i<s.length;i++){
            for(int j=0;j<alphabetArray.length;j++){
                System.out.print(newString);
                System.out.print(alphabetArray[j]);
                
                try{
                    if(alphabetArray[j] == s[i]){
                        myNew = Character.toString(alphabetArray[j]);
                        newString = newString.concat(myNew);
                        Thread.sleep(30);
                        //System.out.println();
                       // System.out.print(newString);
                        break;
                    }

                }catch(Exception e){
                    System.out.println("DO nothing");
                }
                 System.out.println();
                 
                // System.out.println(newString);
                
            }
        }
        System.out.println();
        


    }

    
}
