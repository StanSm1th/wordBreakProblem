package Words;

import strintBreaker.FileReader;

import java.io.IOException;
import java.util.List;

public class TestMain {
   public static void main(String[] ignored) throws IOException {
      strintBreaker.FileReader fileReader = new FileReader();
      List<String> searchWords = fileReader.getContentFromFile();

     // String[] searchWords = {"cat", "dog"};
      String input = "xx cat xx dog xx cat bvewqubu cat dog log cat an og catalog";

      SearchWord.findWordsFromDictionary(searchWords, input);



   }


}