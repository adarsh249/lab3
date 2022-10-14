import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

import java.util.ArrayList;
public class ListTests {
    @Test
    public void testfilter(){
        StringChecker sc = new StringChecker() {
            
            public boolean checkString(String s){
                return s.length() < 8;
            }
        };

        ArrayList<String> list = new ArrayList<>();
        list.add("Pineapple");
        list.add("Apple");
        list.add("Orange");

        List<String> newList = ListExamples.filter(list, sc);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Apple");
        expected.add("Orange");

        
        assertArrayEquals(expected.toArray(), newList.toArray());
    }
}
