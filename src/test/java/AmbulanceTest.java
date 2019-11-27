import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmbulanceTest {

    Ambulance ambulance;

    @Before
    public void before(){
        ambulance = new Ambulance(50, 5);
    }

    @Test
    public void canAddPersonToAmbulance(){
        ambulance.addPerson("Freezer Tooley");
        assertEquals(1, ambulance.getInjuredPeople().size());
    }

}
