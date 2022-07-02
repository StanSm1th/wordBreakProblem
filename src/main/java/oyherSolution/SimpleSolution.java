package oyherSolution;

import java.util.List;

public class SimpleSolution {
    public static void wordBreak(List<String> dict, String word, String out)
    {
        // if the end of the string is reached,
        // print the output string

        if (word.length() == 0)
        {
            System.out.println(out);
            return;
        }

        for (int i = 1; i <= word.length(); i++)
        {
            // consider all prefixes of the current string
            String prefix = word.substring(0, i);

            // if the prefix is present in the dictionary, add it to the
            // output string and recur for the remaining string

            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), out + " " + prefix);
            }
        }
    }

}
