import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by dmitriybala on 26.01.17.
 */
public class CalculatorTest {

    @Test
    public void plusTest() {
        assertEquals(99999999,
                Calculator.calculate(-999999999.99999999, '+', 999999999.99999999 + 99999999.49));

    }

    @Test
    public void minusTest() {
        assertEquals(99999999,
                Calculator.calculate(99999999.999999999, '-', 1.5));
    }

    @Test
    public void divideTest() {
        assertEquals(5,
                Calculator.calculate(200.0, '/', 39.5));
    }

    @Test
    public void multiplyTest() {
        assertEquals(900,
                Calculator.calculate(300.0, '*', 3.0));
    }

    @Test(expected = CalculatorException.class)
    public void wrongOperandTest() {
        Calculator.calculate(1.0, '_', 2.0);
    }

    @Test(expected = CalculatorException.class)
    public void numberIsTooBigTest() {
        Calculator.calculate(100000000.0, '+', 1.0);
    }

    @Test(expected = CalculatorException.class)
    public void numberIsTooBigNegativeTest() {
        Calculator.calculate(-100000000.0, '-', 1.0);
    }

    @Test(expected = CalculatorException.class)
    public void zeroDivision() {
        Calculator.calculate(((Math.random() * Double.MAX_VALUE) - Double.MAX_VALUE / 2), '/', 0);
    }

    @Test
    public void zeroMultiplyTest() {
        assertEquals(0,
                Calculator.calculate(((Math.random() * Double.MAX_VALUE) - Double.MAX_VALUE / 2), '*', 0.0));
    }


}
