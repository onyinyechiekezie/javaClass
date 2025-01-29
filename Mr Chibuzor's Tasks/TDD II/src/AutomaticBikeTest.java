import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AutomaticBikeTest {
    private AutomaticBike automaticBike;

    @Before
    public void setUp() {
        automaticBike = new AutomaticBike();
    }

    @Test
    public void testThatAutomaticBikeExists() {
        assertTrue(automaticBike.setIsAutomaticBikeExist());
    }

    @Test
    public void testAutomaticBikeIsOn() {
        automaticBike.isOn();
        assertTrue(automaticBike.isOn());
    }
    @Test
    public void testAutomaticBikeIsOff() {
        automaticBike.isOff();
        assertTrue(automaticBike.isOff());
    }

    @Test
    public void testAutomaticCanAccelerate() {
        //automaticBike.isAccelerate();
        assertTrue(automaticBike.isAccelerate());
    }
    @Test
    public void testAccelerateGearOne() {
        automaticBike.isOn();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        //assertEquals(1, automaticBike.getSpeed());
        assertEquals(1, automaticBike.getGear());
    }
    @Test
    public void testAccelerateGearTwo() {
        automaticBike.isOn();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        automaticBike.increaseAcceleration();
        //assertEquals(2, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());

    }
}