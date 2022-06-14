package ac;

public class AirConditioner1 {
    private boolean power;
    private int temperature;

    public void setPower(boolean controlSwitch) {
        power = controlSwitch;
    }

    public boolean getPower() {
        return power;

    }

    public void setTemperature(int tempControl) {
        temperature = tempControl;
    }
    public int getTemperature() {
        return temperature;
    }
}



