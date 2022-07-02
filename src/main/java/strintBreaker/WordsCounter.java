package strintBreaker;

import java.util.List;

public class WordsCounter {

    static void searchForWordsFromDictionary(List<String> wordDict, String userInput) {
        for(int i = 0; i < wordDict.size(); i++)  {
            String searchWord = wordDict.get(i);

            System.out.print(searchWord + ": ");

            int foundCount = 0;
            int currIdx = 0;
            while(currIdx != -1)  {
                currIdx = userInput.indexOf(searchWord, currIdx);

                if(currIdx != -1)  {
                    foundCount++;
                    currIdx += searchWord.length();
                }  else  {
                    currIdx = -1;
                }
            }

            System.out.println(foundCount);

        }
    }

}