package ac;

public class AirConditioner {

    private boolean power;
    private boolean control;
    private int increasedNumber;
    private int decreasedNumber;
    public void switchOnSocket(boolean powerStatus) {
        if (powerStatus == true) {
            power = true;
        }
        if (powerStatus == false) {
            power = false;
        }

    }

    public boolean getSwitchCondition() {
        return power;
    }

    public void AcOn(boolean control) {
        if (control == true) {
            control = true;
        }
        if (control == false) {
            control = false;
        }

    }

    public boolean getAcOff() {
        return control;
    }


    public void acTemperatureIncreased(int increasedVolume) {
        if (increasedVolume > 16) {
            increasedNumber = increasedVolume;
        }
    }

    public int acGetTemperatureLevel() {
        return increasedNumber;
    }


    public void acTemperatureDecreased(int decreasedVolume) {
        if (decreasedVolume < 30) {
            decreasedNumber = decreasedVolume;
        }
    }

    public int acGetTemperatureLevel2() {
        return decreasedNumber;
    }
    public void acTemperatureIncreasedBeyound(int increasedVolume) {
        if (increasedVolume >= 30) {
            increasedNumber = 30;
        }
    }

    public int acGetTemperatureLevel5() {
        return increasedNumber;
    }

    public void acTemperatureDecreasedBelow(int decreasedVolume) {
        if (decreasedVolume <= 16) {
            decreasedNumber = 16;
        }
    }
    public int acGetTemperatureLevel6() {
        return decreasedNumber;
    }
}