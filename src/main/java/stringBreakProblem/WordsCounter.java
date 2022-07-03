package stringBreakProblem;

import java.util.List;

public class WordsCounter {

    static void searchForWordsFromDictionary(List<String> wordDict, String userInput) {
        for (int i = 0; i < wordDict.size(); i++) {
            String searchForWordFromDictionary = wordDict.get(i);

            System.out.print(searchForWordFromDictionary + ": ");

            int countOfWords = 0;
            int currentIndex = 0;
            while (currentIndex != -1) {
                currentIndex = userInput.indexOf(searchForWordFromDictionary, currentIndex);

                if (currentIndex != -1) {
                    countOfWords++;
                    currentIndex += searchForWordFromDictionary.length();
                } else {
                    currentIndex = -1;
                }
            }

            System.out.println(countOfWords);

        }
    }

}