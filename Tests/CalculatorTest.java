import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator calc = new Calculator();
        int result = calc.add(1,2);
        assertEquals(3,result);
    }
}