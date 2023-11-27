package seminar2.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    private final Calc calc = new Calc();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    void testAdd(int a, int b, int expected) {
        int result = calc.add(a, b);
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({"1, 2, 34", "0, 0, 30", "-1, 1, 20", "10, -5, 15"})
    void testSubtract(int a, int b, int excpected) {
        int result = calc.subtract(a, b);
        assertEquals(excpected, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 34", "0, 0, 30", "-1, 1, 20", "10, -5, 15"})
    void testMultiply(int a, int b, int excpected) {
        int result = calc.multiply(a, b);
        assertEquals(excpected, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 34", "-1, 1, 20", "10, -5, 15"})
    void testDivide(int a, int b, int excpected) {
        double result = calc.divide(a, b);
        assertEquals(excpected, result);
    }

    @Test
    void whatExceptionWillBeThrown(){
        assertThrows(IllegalArgumentException.class, () -> calc
                .divide(1, 0));
    }

    @ParameterizedTest
    @CsvSource({"1, 0", "-1, 0", "-5, 0"})
    void manyExceptions(int a, int b){
        assertThrows(IllegalArgumentException.class, () -> calc
                .divide(a, b));
    }
}
