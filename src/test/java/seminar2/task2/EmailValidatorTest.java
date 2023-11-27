package seminar2.task2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


//Напишите тесты с использованием аннотаций @Test, @Before,
// @After, @BeforeClass, @AfterClass для проверки различных
// сценариев, включая правильные и неправильные адреса.
public class EmailValidatorTest {

    private static EmailValidator emailValidator;
    @BeforeClass
    static void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterClass
     static void tearDown() {
        emailValidator = null;
    }

    @Test
    void isValidEmail() {
        assertTrue(emailValidator.isValidEmail("234klj@lj.ru"));
    }

    @Test
    void isNotValidEmail() {
        assertFalse(emailValidator.isValidEmail("234kljj.ru"));
    }
}
