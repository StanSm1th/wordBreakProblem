package strintBreaker;

import javax.swing.*;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        String input;
        input = JOptionPane.showInputDialog("enter string");

        Solution wb = new Solution();
        FileReader fileReader = new FileReader();
        System.out.println("dictionary contains" + fileReader.getContentFromFile());
        Set<String> wordDict = fileReader.getContentFromFile();
        System.out.println("Break string using dictionary: "
                + wb.wordBreak(input.toLowerCase(Locale.ROOT), wordDict));

    }
}
