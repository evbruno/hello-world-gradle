package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter subject = new Greeter();
        assertEquals("Hello world!", subject.sayHello());
    }

    @Test
    public void testSayHelloParam() {
        Greeter subject = new Greeter();
        assertEquals("Hello failure A", subject.sayHello("dummy"));
    }

    @Test
    public void testLongCompute() {
        sleep(30);
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
