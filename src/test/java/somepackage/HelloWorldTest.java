package somepackage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by safon on 07.01.2017.
 */
public class HelloWorldTest {
    @Test
    public void summaryMethodBasic() throws Exception {
    assertNotEquals(10,new HelloWorld().summaryMethod(5,10));
    }
    @Test
    public void summaryMethodPassed() throws Exception {
        assertEquals(15,new HelloWorld().summaryMethod(5,10));
    }
    @Test
    public void summaryMethod() throws Exception {
        assertEquals(220,new HelloWorld().summaryMethod(5,10));
    }

}