package seminar5.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator;
    private List<Integer> generationNumbers = new ArrayList<>();
    @BeforeEach
    void setUp() {
        randomNumberGenerator = new RandomNumberGenerator(1, 12);
        generationNumbers = randomNumberGenerator.generateRandomNumbers(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверка длины готового списка")
    void generateRandomNumbers() {
        List<Integer> generationNumbers = randomNumberGenerator.generateRandomNumbers(5);
        assertEquals(5, generationNumbers.size());
    }

    @Test
    @DisplayName("Проверка входит ли число в нужный промежуток")
    void generateRandomNumbers2() {
        for (int num : generationNumbers){
            assertTrue(num >= 1 && num <= 12);
        }
    }


}