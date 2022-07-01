package strintBreaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileReader {

    Set<String> getContentFromFile() throws IOException {
        Set<String> content = new HashSet<>();
        BufferedReader bufferedReader
                = new BufferedReader(new java.io.FileReader("src/main/resources/file.txt"));
        String word;
        while ((word = bufferedReader.readLine()) != null){
            content.add(word);
        }
        return content;
    }

}
