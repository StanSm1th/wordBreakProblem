package stringBreakProblem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

class FileReaderTest {

    // The environment to prepare for testing
    //                                                           @Before
    @BeforeAll
    public static void beforeRead() {
        System.out.println(" Prepare test environment for success ...");
    }

    // Read file data, put the file data all
    @Test
    public void readFile() throws IOException {
        FileInputStream fileInputStream =
                new FileInputStream("C:\\Users\\Zvidr\\IdeaProjects\\wordBreakProblem\\src\\main\\resources\\file.txt");
        int content = fileInputStream.read();
        System.out.println(" Content: " + content);
    }

    @Test
    public void sort() {
        System.out.println(" Read file data sort ..");
    }

    // Ways to clean up your test environment
                                                                // @After
    @AfterAll
    public static void afterRead() {
        System.out.println(" Clean up the test environment ..");
    }
}