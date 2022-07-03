package stringBreakProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StringBreaker {
    public List<String> wordBreak(String userInput, List<String> dictionary) {
        List<String> res = new ArrayList<>();
        if (userInput == null || userInput.length() == 0) {
            return res;
        }
        
        List<String> temporarryArrayOfWords[] = new ArrayList[userInput.length() + 1];
        temporarryArrayOfWords[0] = new ArrayList<>();
        temporarryArrayOfWords[0].add("");
        
        for (int i = 0; i < userInput.length(); i++) {
            for (int j = i; j >= 0; j--) {
                
                if (dictionary.contains(userInput.substring(j, i + 1)) && temporarryArrayOfWords[j] != null) {

                    if (temporarryArrayOfWords[i + 1] == null) {
                        temporarryArrayOfWords[i + 1] = new ArrayList<>();
                    }

                    for (int k = temporarryArrayOfWords[j].size() - 1; k >= 0; k--) {
                        String current = "";
                        if (i != userInput.length() - 1) {
                            current += temporarryArrayOfWords[j].get(k) + userInput.substring(j, i + 1) + " ";
                        } else {
                            current += temporarryArrayOfWords[j].get(k) + userInput.substring(j, i + 1);
                        }
                        temporarryArrayOfWords[i + 1].add(current);
                    }
                }
            }
        }
        return temporarryArrayOfWords[temporarryArrayOfWords.length - 1]
                == null ? new ArrayList() : temporarryArrayOfWords[temporarryArrayOfWords.length - 1];
    }
}
