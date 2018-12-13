import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void printMeSuccess() {
        Dummy test = new Dummy("test", "type");
        assertEquals("test type", test.printMe());
    }

    @Test
    public void printMeFail() {
        Dummy test = new Dummy("test", "type");
        assertEquals("asdf", test.printMe());
    }
}