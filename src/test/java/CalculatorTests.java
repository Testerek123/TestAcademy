import answers.lukasz.CalculatorDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
    public void addTest() {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        double result = calculatorDemo.add(1.2, 1.3);
        Assertions.assertEquals(2.5, result, "Calculator sum is not expected");


    }

    @Test
    public void mutliplyTest() {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        double result = calculatorDemo.multiply(2, 2.6);
        Assertions.assertEquals(5.2, result, "Calculator multiplication result is not expected");
    }
}
