package ac;

import ac.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void onBikeTest() {
        //Given that I bought a Bike
        Bike kymco = new Bike();
        //Turn on the bike
        kymco.setPower(true);
        //check if bike is on
        assertEquals(true, kymco.getPower());
    }

    @Test
    public void offBikeTest() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setPower(false);
        assertEquals(false, kymco.getPower());
    }

    @Test
    public void acceleratedBikeTestA() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(15);
        kymco.accelerator(true);
        assertEquals(16, kymco.getSpeed());

    }

    @Test
    public void acceleratedBikeTestB() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(24);
        kymco.accelerator(true);
        assertEquals(26, kymco.getSpeed());

    }

    @Test
    public void acceleratedBikeTestC() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(35);
        kymco.accelerator(true);
        assertEquals(38, kymco.getSpeed());
    }

    @Test
    public void acceleratedBikeTestD() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(44);
        kymco.accelerator(true);
        assertEquals(48, kymco.getSpeed());
    }

    @Test
    public void decceleratedBikeTestA() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(15);
        kymco.deccelerator1(true);
        assertEquals(14, kymco.getSpeed());
    }

    @Test
    public void decceleratedBikeTestB() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(24);
        kymco.deccelerator2(true);
        assertEquals(22, kymco.getSpeed());
    }

    @Test
    public void decceleratedBikeTestC() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(35);
        kymco.deccelerator3(true);
        assertEquals(32, kymco.getSpeed());
    }

    @Test
    public void decceleratedBikeTestD() {
        Bike kymco = new Bike();
        kymco.setPower(true);
        kymco.setSpeed(44);
        kymco.deccelerator4(true);
        assertEquals(40, kymco.getSpeed());
    }
}