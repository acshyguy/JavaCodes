package ac;

public class Bike {
    private boolean power;
    private int speed;
    private boolean accelerator;
    private boolean deccelerator;

    public void setPower(boolean switchControl) {
        power = switchControl;
    }

    public boolean getPower() {
        return power;
    }

    public void setSpeed(int speedMeter) {
        speed = speedMeter;
    }

    public void accelerator(boolean pedaling) {
        accelerator = pedaling;
        if (accelerator = true) {
            if (speed < 21) {
                speed = speed + 1;
            }
            if (accelerator = true) {
                if (speed > 20 && speed < 31) {
                    speed = speed + 2;
                }
            }
            if (accelerator = true) {
                if (speed > 30 && speed < 41) {
                    speed = speed + 3;
                }

            }
            if (accelerator = true) {
                if (speed > 40) {
                    speed = speed + 4;
                }

            }

        }
    }

    public int getSpeed() {
        return speed;
    }

    public void deccelerator1(boolean pedaling) {
        deccelerator = pedaling;
        if (deccelerator == true) {
            if (speed < 21) {
                speed = speed - 1;
            }
        }
    }
    public void deccelerator2( boolean pedaling) {
        deccelerator = pedaling;
        if (deccelerator == true) {
            if (speed > 20 && speed < 31) {
                speed = speed - 2;
            }
        }
    }
    public void deccelerator3( boolean pedaling) {
        deccelerator = pedaling;
        if (deccelerator == true) {
            if (speed > 30 && speed < 41) {
                speed = speed - 3;
            }
        }
    }
    public void deccelerator4( boolean pedaling) {
        deccelerator = pedaling;
        //if (accelerator == true) {
            if (speed > 40) {
                speed = speed - 4;
            }
        }
    //}
}
