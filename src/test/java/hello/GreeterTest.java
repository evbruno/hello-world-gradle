package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter subject = new Greeter();
        assertEquals("hello World!", subject.sayHello());
    }

    @Test
    public void testLongCompute() {
        sleep(5);
        assertTrue(true);
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
