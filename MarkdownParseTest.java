import static org.junit.Assert.*;
import java.nio.file.Files;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;



public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        MarkdownParse mdp = new MarkdownParse();
        String [] expected = {"https://something.com", "some-thing.html"};
        //expected.add("https://something.com");
        //expected.add("some-thing.html");
        //Path filename = Path.of("test-file.md");
        assertArrayEquals(expected, mdp.getLinks(content).toArray() );
    }

}
