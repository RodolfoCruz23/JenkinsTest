import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers") // specifies a more convenient and informative name for the test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Add two negative numbers") // specifies a more convenient and informative name for the test
    void addnegatives() {
        assertEquals(-10, Calculator.add(-2, -3));
    }

    @Test
    @DisplayName("Multiply two numbers") //multiple assertions in a single test
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Divide") //divide
    void divide() { //divide
        assertAll(() -> assertEquals(1, Calculator.divide(1.7976931348623157E+308, 1.7976931348623157E+308)),
                () -> assertEquals(1, Calculator.divide(2, 2)),
                () -> assertEquals(-1, Calculator.divide(2, -2)),
                () -> assertEquals(1, Calculator.divide(-2, -2)));
    }

}