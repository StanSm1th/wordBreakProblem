package stringBreakProblem;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        String userInput;
        userInput = JOptionPane.showInputDialog("enter string");

        StringBreaker stringBreaker = new StringBreaker();
        FileReader fileReader = new FileReader();
        List<String> dictionaryOfWords = fileReader.getContentFromFile();

        System.out.println("dictionary contains" + fileReader.getContentFromFile());

        List<String> wordsFoundInsideInputString =
                stringBreaker.wordBreak(userInput.toLowerCase(Locale.ROOT), dictionaryOfWords);

        System.out.println("breaking string " + wordsFoundInsideInputString);

        WordsCounter.searchForWordsFromDictionary(dictionaryOfWords, userInput);


    }
}