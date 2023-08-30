import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c1 = new Calculator();
        int result = c1.add(5, 10);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        Calculator c2 = new Calculator();
        int result = c2.subtract(10, 5);
        assertEquals(5, result);
    }
}
