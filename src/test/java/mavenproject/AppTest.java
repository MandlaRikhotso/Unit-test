package mavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(5, App.calculate(1, 2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, App.calculate(2, 3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, App.calculate(3, 2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, App.calculate(4, 6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            App.calculate(4, 1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.calculate(5, 1, 1);
        });
        assertEquals("Operator is invalid", exception.getMessage());
    }
}
