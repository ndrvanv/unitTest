package calculator;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает
// сумму с учетом скидки. Ваша задача - проверить этот метод с
// использованием библиотеки AssertJ. Если метод calculateDiscount
// получает недопустимые аргументы, он должен выбрасывать исключение
// ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

    class CalculatorHwTest {

        private Calculator calculator = new Calculator();

        @Test
        void testCalculateDiscount() {
            double amount = 100;
            double discount = 10;

            double expected = 90;

            double actual = calculator.calculateDiscount(amount, discount);

            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void testCalculateDiscountWithInvalidInputs() {
            assertThatExceptionOfType(ArithmeticException.class)
                    .isThrownBy(() -> calculator.calculateDiscount(100, -5));
        }

    }

    class Calculator {

        public double calculateDiscount(double amount, double discount) {
            if(discount < 0) {
                throw new ArithmeticException("Discount cannot be negative");
            }
            return amount - amount * discount / 100;
        }

    }

