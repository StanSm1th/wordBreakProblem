package strintBreaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> wordBreak(String input, Set<String> wordDict) {
        List<String> res = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return res;
        }

        boolean[] f = new boolean[input.length() + 1];
        f[0] = true;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (f[j] && wordDict.contains(input.substring(j, i + 1))) {
                    f[i + 1] = true;
                }
            }
        }

        if (!f[input.length()]) {
            return res;
        }


        List<String> temporarry[] = new ArrayList[input.length() + 1];
        temporarry[0] = new ArrayList<>();
        temporarry[0].add("");

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (wordDict.contains(input.substring(j, i + 1)) && temporarry[j] != null) {

                    if (temporarry[i + 1] == null) {
                        temporarry[i + 1] = new ArrayList<String>();
                    }

                    for (int k = temporarry[j].size() - 1; k >= 0; k--) {
                        String current = "";
                        if (i != input.length() - 1) {
                            current += temporarry[j].get(k) + input.substring(j, i + 1) + " ";
                        } else {
                            current += temporarry[j].get(k) + input.substring(j, i + 1);
                        }
                        temporarry[i + 1].add(current);
                    }
                }
            }
        }
        return temporarry[temporarry.length - 1] == null ? new ArrayList() : temporarry[temporarry.length - 1];
    }
}

