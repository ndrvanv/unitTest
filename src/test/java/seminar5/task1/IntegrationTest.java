package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    private MaxNumberFinder maxNumberFinder;
    private RandomNumberGenerator randomNumberGenerator;

    @Test
    void checkThemAllTogether(){
        randomNumberGenerator = new RandomNumberGenerator(1, 12);
        List<Integer> generatorNumber = randomNumberGenerator.generateRandomNumbers(5);
        int actualMax = Collections.max(generatorNumber);
        maxNumberFinder = new MaxNumberFinder();
        assertEquals(actualMax, maxNumberFinder.findMaxNumber(generatorNumber));
    }
}
