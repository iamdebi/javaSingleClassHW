
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals( 3, calculator.subtract(7, 4));
    }

    @Test
    public void canMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public  void canDivide() {
        assertEquals(4.0, calculator.divide(12.0, 3.0), 0.0001);
    }
}
