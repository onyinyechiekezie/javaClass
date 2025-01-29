public class AutomaticBike {
    private boolean isAutomaticBikeExist = true;
    private boolean isOn = false;
    private int speed = 0;
    private int gear = 0;
    private boolean isOff;
    private boolean isAccelerate = true;

    public boolean isOn() {
        this.isOn = true;
        return this.isOn;
    }
    public void setOn(boolean on) {
        isOn = on;

    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean setIsAutomaticBikeExist() {
        if (this.isAutomaticBikeExist) {
            this.isAutomaticBikeExist = true;
            return true;
        }
        return false;
    }

    public boolean isOff() {
        this.isOff = true;
        this.speed = 0;
        return this.isOff;
    }

    public boolean isAccelerate() {
        if (this.isAccelerate) {
            return this.isAccelerate;
        }
        return false;
    }

    public int increaseAcceleration() {
        if (this.isAccelerate) {
            if (speed >= 0 && speed <= 20) {
                gear = 1;
                //speed += 1;
            }
            if (speed >= 21 && speed <= 30) {
                gear = 2;
                //speed += 2;
            }
            if (speed >= 31 && speed <= 40) {
                gear = 3;
                speed += 3;
            }
            if (speed >= 41) {
                gear = 4;
                speed += 4;
            }
        }
        return speed;
    }



}


