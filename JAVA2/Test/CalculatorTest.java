package Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest{
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3)); //it will compare the result
        assertEquals(14, calculator.add(5, 9));
    }
    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
        assertEquals(15.0f, calculator.mul(5.0f, 3.0f),0);
    }
}