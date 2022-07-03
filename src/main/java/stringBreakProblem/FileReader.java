package stringBreakProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileReader {

    public List<String> getContentFromFile() throws IOException {
        List<String> content = new ArrayList<>();
        BufferedReader bufferedReader
                = new BufferedReader(new java.io.FileReader("src/main/resources/file.txt"));
        String word;
        while ((word = bufferedReader.readLine()) != null) {
            content.add(word);
        }
        return content;
    }

}