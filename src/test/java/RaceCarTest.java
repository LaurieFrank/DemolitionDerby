import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceCarTest {

    RaceCar raceCar1;
    RaceCar raceCar2;

    @Before
    public void before(){
        raceCar1 = new RaceCar("Rover 75", 10, 111000, 7);
        raceCar2 = new RaceCar("Pagani Zonda", 60, 450, 3);
    }

    @Test
    public void getCarIntegrity(){
        assertEquals(7, raceCar1.getCarIntegrity());
    }

}
