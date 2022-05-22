import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Files;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

	@Test
	public void vimTest(){
		assertEquals(9,3*3);
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

    @Test
    public void report4Test1() throws IOException{
        List expected = List.of("`google.com", "google.com", "ucsd.edu");
        Path fileName = Path.of("lab-report-4-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    
    @Test
    public void report4Test2() throws IOException{
        List expected = List.of("a.com", "a.com(())", "example.com");
        Path fileName = Path.of("lab-report-4-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }
    
    @Test
    public void report4Test3() throws IOException{
       List expected = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
       Path fileName = Path.of("lab-report-4-3.md");
       String content = Files.readString(fileName);
       ArrayList<String> actual = MarkdownParse.getLinks(content);
       assertEquals(expected, actual);
    }
    
}
