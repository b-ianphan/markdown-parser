import static org.junit.Assert.*;

import java.nio.file.Files;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks(){
        MarkdownParse mdp = new MarkdownParse();
        String[] expected = {"https://something.com", "some-page.html"};
        assertArrayEquals(expected, mdp.getLinks(Files.readString(test-file.md)));
    }

}
