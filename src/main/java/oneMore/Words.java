package oneMore;

import java.util.HashMap;
import java.util.Map;

public class Words {

    Map<String , Integer> dictionary= new HashMap<>();

    public static void main(String[] args) {
        String myWords = "soon hi also soon job mother job also soon later";
        Words myW = new Words();
        String[] array=myWords.split("\\s+");
        myW.countWords(array);
        System.out.println(myW.dictionary);
    }

    public void countWords(String[] myWords) {

        for(String s:myWords){

            if(dictionary.containsKey(s))
                dictionary.put(s, dictionary.get(s)+1);
            else
                dictionary.put(s, 1);
        }
    }
}