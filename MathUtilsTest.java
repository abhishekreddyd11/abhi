// MathUtilsTest.java
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        // Clean up resources if needed
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-3, mathUtils.subtract(2, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, mathUtils.multiply(5, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
    }

    /**
     * 
     */
    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001); // Division by zero
    }
}

