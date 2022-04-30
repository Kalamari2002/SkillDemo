import static org.junit.Assert.*;
import org.junit.*;


public class NameFinderTester {
    String[] names = new String[]{"Jose", "Luiza", "Mateus", "Bia", "Ryo", "Thiago", "Ana", "Gabriel"};
    NameFinder finder;

    @Before
    public void setUp() throws Exception{
        finder = new NameFinder();
    }

    @Test
    public void findJoao(){
        assertTrue(finder.FindName(names, "Jose"));
    }
}
