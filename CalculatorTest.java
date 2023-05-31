import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        // Testiranje osnovnih operacija
        String result = Calculator.Run("4+5*3");
        Assert.assertEquals("19.0", result);

        result = Calculator.Run("10-5/2");
        Assert.assertEquals("7.5", result);

        result = Calculator.Run("-8+6");
        Assert.assertEquals("-2.0", result);

        result = Calculator.Run("2*3+4-5");
        Assert.assertEquals("5.0", result);

        // Testiranje podela sa nulom
        result = Calculator.Run("5/0");
        Assert.assertEquals("Infinity", result);

        result = Calculator.Run("0/0");
        Assert.assertEquals("NaN", result);

        // Testiranje neispravnog izraza
        result = Calculator.Run("2+3*4");
        Assert.assertEquals("7.0", result);
    }
}
