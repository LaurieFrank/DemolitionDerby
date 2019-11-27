import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceTrackTest {

    RaceTrack raceTrack;
    Ambulance ambulance;
    SafetyCar safetyCar;
    RaceCar raceCar1;
    RaceCar raceCar2;

    @Before
    public void before(){
        raceCar1 = new RaceCar("Rover 75", 10, 111000, 7);
        raceCar2 = new RaceCar("Pagani Zonda", 60, 450, 3);
        ambulance = new Ambulance(50, 5);

    }

//    @Test
//    public void numberOfVehiclesOnTrack(){
//        raceTrack.getVehiclesOnTrack(vehicle);
//        assertEquals(1, raceTrack.getVehiclesOnTrack().size());
//
//
//
//    }

}
