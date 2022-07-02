package Words;

import java.util.List;

/**
 * It doesn't create any new objects.It uses String.indexOf(String, int),
 * keeps track of the current index, and increments the occurrence-count.
 */

public class SearchWord {


    static void findWordsFromDictionary(List<String> searchWords, String input) {


        for (int i = 0; i < searchWords.size(); i++) {
            String searchWord = searchWords.get(i);

            System.out.print(searchWord + ": ");

            int foundCount = 0;
            int currentIndex = 0;
            while (currentIndex != -1) {
                currentIndex = input.indexOf(searchWord, currentIndex);

                if (currentIndex != -1) {
                    foundCount++;
                    currentIndex += searchWord.length();
                } else {
                    currentIndex = -1;
                }
            }

            System.out.println(foundCount);

        }
    }
}
