package hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testCarHasFourWheels() {
        Motorcycle motorcycle = new Motorcycle("Kiyosaki", "350w", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarSpeedInTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Kiyosaki", "350w", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarStopsInParkMode() {
        Motorcycle motorcycle = new Motorcycle("Kiyosaki", "350w", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}