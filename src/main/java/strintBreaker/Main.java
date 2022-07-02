package strintBreaker;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        String userInput;
        userInput = JOptionPane.showInputDialog("enter string");

        Solution wordBreak = new Solution();
        FileReader fileReader = new FileReader();
        List<String> wordDict = fileReader.getContentFromFile();

        System.out.println("dictionary contains" + fileReader.getContentFromFile());


//        System.out.println("Break string using dictionary: "
//                + wordBreak.wordBreak(userInput.toLowerCase(Locale.ROOT), wordDict));
        List<String> words = wordBreak.wordBreak(userInput.toLowerCase(Locale.ROOT), wordDict);
        //WordsCounter wordsCounter = new WordsCounter();
        System.out.println("breaking string" +words);
        WordsCounter.searchForWordsFromDictionary(wordDict, userInput);





    }
}
