package hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    void testInstanceOfVehicle() {
        Car car = new Car("Toyota", "Corolla", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testCarSpeedInTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testCarStopsInParkMode() {
        Car car = new Car("Toyota", "Corolla", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}