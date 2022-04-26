package ac;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void airConditionerCheckTest() {
        //Given that I bought an Air Conditioner
        AirConditioner lgAirConditioner = new AirConditioner();
        try {
            Class.forName("ac.AirConditioner");
        } catch (ClassNotFoundException className) {
            fail("should have a class called AirConditioner");
        }

    }

    @Test
    public void onAcTest() {
        //Given that Ac is off
        AirConditioner onAcAirConditioner = new AirConditioner();
        //when I switch the power On
        onAcAirConditioner.switchOnSocket(true);
        //Check that my AC is on
        assertTrue(onAcAirConditioner.getSwitchCondition());
    }

    @Test
    public void AcOffTest() {
        //Given that AC is on
        AirConditioner isAcOffAirConditioner = new AirConditioner();
        //When I turn it off
        isAcOffAirConditioner.AcOn(false);
        //Check that AC is off
        assertEquals(false, isAcOffAirConditioner.getAcOff());
    }

    @Test
    public void increaseInTemperature() {
        //Given that I am feeling cold (decreased temperature)
        AirConditioner weather = new AirConditioner();
        //when I increase the temperature
        weather.acTemperatureIncreased(25);
        //Check if the temperature is increased
        assertEquals(25, weather.acGetTemperatureLevel());

    }

    @Test
    public void decreaseInTemperature() {
        //Given that I am feeling hot (increased temperature)
        AirConditioner weather = new AirConditioner();
        //When I decrease the temperature
        weather.acTemperatureDecreased(19);
        //Check if the temperature is decreased
        assertEquals(19, weather.acGetTemperatureLevel2());

    }

    @Test
    public void increaseInTemperatureNo5() {
        //Given that I am feeling cold (decreased temperature)
        AirConditioner weather = new AirConditioner();
        //when I increase the temperature
        weather.acTemperatureIncreasedBeyound(30);
        //Check if the temperature is increased
        assertEquals(30, weather.acGetTemperatureLevel());

    }

    @Test
    public void decreaseInTemperature6() {
        //Given that I am feeling hot (increased temperature)
        AirConditioner weather = new AirConditioner();
        //When I decrease the temperature
        weather.acTemperatureDecreasedBelow( 16);
        //Check if the temperature is decreased
        assertEquals(16, weather.acGetTemperatureLevel());
    }
}

