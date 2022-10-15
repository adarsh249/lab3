import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileExampleTests {
    
    @Test
    public void testGetFiles1() throws IOException{
        File file1 = new File("some-files/more-files");
        List<File> expected = new ArrayList<>();

        expected.add(new File("some-files/more-files/c.java"));
        expected.add(new File("some-files/more-files/b.txt"));
        assertArrayEquals(expected.toArray(), FileExample.getFiles(file1).toArray());
    }

    @Test
    public void testGetFiles2() throws IOException{
        List<File> expected = new ArrayList<>();
        File file2 = new File("some-files/");
        expected.add(new File("some-files/even-more-files/d.java"));
        expected.add(new File("some-files/even-more-files/a.txt"));
        expected.add(new File("some-files/more-files/c.java"));
        expected.add(new File("some-files/more-files/b.txt"));
        expected.add(new File("some-files/a.txt"));

        assertArrayEquals(expected.toArray(), FileExample.getFiles(file2).toArray());
    }

    @Test
    public void testGetFiles3() throws IOException{
        List<File> expected = new ArrayList<>();
        File file3 = new File("some-files/a.txt");
        expected.add(file3);

        assertArrayEquals(expected.toArray(), FileExample.getFiles(file3).toArray());
    }
}
