package stringBreakProblem;

import java.util.List;

public class WordsCounter {

    static void searchForWordsFromDictionary(List<String> dictionaryOfWords, String userInput) {
        for (int i = 0; i < dictionaryOfWords.size(); i++) {
            String searchForWordFromDictionary = dictionaryOfWords.get(i);

            System.out.print(searchForWordFromDictionary + ": ");

            int totalWordsCountFromDictionary = 0;
            int currentIndexOfWord = 0;
            while (currentIndexOfWord != -1) {
                currentIndexOfWord = userInput.indexOf(searchForWordFromDictionary, currentIndexOfWord);

                if (currentIndexOfWord != -1) {
                    totalWordsCountFromDictionary++;
                    currentIndexOfWord += searchForWordFromDictionary.length();
                } else {
                    currentIndexOfWord = -1;
                }
            }

            System.out.println(totalWordsCountFromDictionary);

        }
    }

}