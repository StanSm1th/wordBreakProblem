package oyherSolution;

import java.util.Arrays;
import java.util.List;
 
class Main
{
    // Function to segment given string into a space-separated
    // sequence of one or more dictionary words
 

    // Word Break Problem Implementation in Java
    public static void main(String[] args)
    {
        // List of strings to represent a dictionary
        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word",
            "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem");
 
        // input string
        String word = "Wordbreakproblem";
        SimpleSolution wordBreak = new SimpleSolution();
 
        wordBreak.wordBreak(dict, word, "");
    }
}
