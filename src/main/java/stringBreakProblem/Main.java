package stringBreakProblem;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        String userInput;
        userInput = JOptionPane.showInputDialog("enter string");

        StringBreaker wordBreak = new StringBreaker();
        FileReader fileReader = new FileReader();
        List<String> wordDict = fileReader.getContentFromFile();

        System.out.println("dictionary contains" + fileReader.getContentFromFile());

        List<String> words = wordBreak.wordBreak(userInput.toLowerCase(Locale.ROOT), wordDict);

        System.out.println("breaking string " + words);

        WordsCounter.searchForWordsFromDictionary(wordDict, userInput);


    }
}