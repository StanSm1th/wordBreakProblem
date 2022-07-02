package oneMore;

import strintBreaker.Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        List<String> dictionary = Arrays.asList("cat", "dog", "mouse");

        String userInput = "catdogcatxx";

        Solution wordBreak = new Solution();
        wordBreak.wordBreak(userInput, dictionary);


        class Solution {
            boolean wordBreakUtil(String s, int start, String[] w) {
                if (start == s.length()) {
                    return true;
                }
                for (int i = start; i < s.length(); i++) {
                    String currWord = s.substring(start, i + 1);
                    for(int j = 0; j < w.length; j++) {
                        if (currWord.equals(w[j])) {
                            if(wordBreakUtil(s, i + 1, w)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            boolean wordBreak (String s, String[] w) {
                return wordBreakUtil(s, 0, w);
            }
        }
    }
}