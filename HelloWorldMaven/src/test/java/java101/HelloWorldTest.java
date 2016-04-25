package java101;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class HelloWorldTest {

    @Test
    public void test() {
        assertNotEquals("foo", "bar");
    }

}
