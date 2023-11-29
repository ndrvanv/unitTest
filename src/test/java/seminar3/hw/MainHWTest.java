package seminar3.hw;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
//Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
//переданное число четным или нечетным:
    @Test
    public void testEvenNumber() {
        // инициализация
        int n = 2;
        // выполнение
        boolean result = evenOddNumber(n);
        // проверка
        Assert.assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        // инициализация
        int n = 3;
        // выполнение
        boolean result = evenOddNumber(n);
        // проверка
        Assert.assertFalse(result);
    }

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


//     Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
//переданное число в интервал (25;100)
    @Test
    public void testNumberInInterval() {
        // инициализация
        int numberInsideInterval = 50;
        int numberOutsideInterval = 10;
        // выполнение
        boolean resultInside = numberInInterval(numberInsideInterval);
        boolean resultOutside = numberInInterval(numberOutsideInterval);
        // проверка
        Assert.assertTrue(resultInside);
        Assert.assertFalse(resultOutside);
    }

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}