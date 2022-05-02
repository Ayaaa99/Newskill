import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert;
public class JunitTest {
    @Test
    public void subtraction(){
        assertEquals(2, Javafile.minus(3));
    }
}
