import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
public class CalculatorTest {

    @Test
    public void testCalculate() {
        List<Float> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();

        numbers.add(4.0f);
        numbers.add(2.0f);
        operations.add("*");

        Calculator.Calculate(numbers, operations);
        Assert.assertEquals(8.0f, Calculator.finalResult, 0.0001f);

        numbers.clear();
        operations.clear();

        numbers.add(10.0f);
        numbers.add(5.0f);
        numbers.add(2.0f);
        operations.add("-");
        operations.add("*");

        Calculator.Calculate(numbers, operations);
        Assert.assertEquals(0.0f, Calculator.finalResult, 0.0001f);

        numbers.clear();
        operations.clear();

        numbers.add(12.0f);
        numbers.add(2.0f);
        numbers.add(3.0f);
        operations.add("*");
        operations.add("/");

        Calculator.Calculate(numbers, operations);
        Assert.assertEquals(8.0f, Calculator.finalResult, 0.0001f);

        numbers.clear();
        operations.clear();

        numbers.add(10.0f);
        numbers.add(3.0f);
        operations.add("/");

        Calculator.Calculate(numbers, operations);
        Assert.assertEquals(3.3333f, Calculator.finalResult, 0.0001f);
    }
}
