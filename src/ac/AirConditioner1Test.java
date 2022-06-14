package ac;

public class AirConditioner1Test {
    public static void main(String[] args) {
        AirConditioner1 sanyo = new AirConditioner1();

        sanyo.setPower(true);
        if (sanyo.getPower() == true) {
            System.out.println("Power is 0n.");
        }

        sanyo.setPower(false);
        if (sanyo.getPower() == false) {
            System.out.println("Power is 0ff.");
        }

        sanyo.setTemperature(17);
        System.out.println("My current temperature is "+ sanyo.getTemperature());

        sanyo.setTemperature(24);
        System.out.println("My increased temperature is "+ sanyo.getTemperature());


    }
}
