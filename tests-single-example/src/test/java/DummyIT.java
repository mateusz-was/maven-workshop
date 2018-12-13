import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DummyIT {

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