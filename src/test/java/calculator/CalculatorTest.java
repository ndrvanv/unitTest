
package calculator;

//@sayhipash

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

    class CalculatorTest {


        private Calculator calculator;

        @BeforeAll
        static void beforeAll() {
            // Здесь могут быть глобальные операции инициализации
        }

        @AfterAll
        static void afterAll() {
            // Здесь могут быть глобальные операции завершения
        }

        @BeforeEach
        void setUp() {
            calculator = new Calculator();
        }

        @AfterEach
        void tearDown() {
            calculator = null;
        }

        @Test
        @DisplayName("Проверка суммирования")
        void testAdd() {
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        @DisplayName("Проверка вычитания")
        void testSubtract() {
            assertEquals(1, calculator.subtract(3, 2));
        }

        @Test
        @DisplayName("Проверка умножения")
        void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
        }

        @Test
        @DisplayName("Проверка деления")
        void testDivide() {
            assertEquals(2.0, calculator.divide(4, 2));
        }

        @Test
        @DisplayName("Проверка деления на ноль")
        void testDivideByZero() {
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        }

        @Test
        @Disabled("Этот тест отключен")
        void disabledTest() {
            fail("Не будет выполнен");
        }

        @ParameterizedTest
        @ValueSource(ints = {0, 1, 2, 3})
        @DisplayName("Параметризованный тест для умножения на 2")
        void testMultiplyWithParameters(int arg) {
            assertEquals(arg * 2, calculator.multiply(arg, 2));
        }

        @Test
        @DisplayName("Проверка истинного условия")
        void testAssertTrue() {
            assertTrue(calculator.add(2, 2) == 4);
        }

        @Test
        @DisplayName("Проверка ложного условия")
        void testAssertFalse() {
            assertFalse(calculator.add(2, 2) == 5);
        }

        @Test
        @DisplayName("Проверка наличия объекта")
        void testAssertNotNull() {
            assertNotNull(calculator);
        }

        @Test
        @DisplayName("Проверка отсутствия объекта")
        void testAssertNull() {
            calculator = null;
            assertNull(calculator);
        }

        @Test
        @DisplayName("Проверка равенства массивов")
        void testAssertArrayEquals() {

            int[] expected = {1, 2, 3};
            int[] actual = {1, 2, 3};
            assertArrayEquals(expected, actual);

        }

    }
