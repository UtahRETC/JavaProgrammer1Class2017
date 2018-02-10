package models;

/**
 * State object for the upcoming shot.
 */
public class ShotModel {
    private int angle = 45;
    private int power = 10;

    public int getPower() {
        return power;
    }

    public void incrementPower() {
        power = power + 1;
    }

    public void decrementPower() {
        power = power - 1;
    }

    public int getAngle() {
        return angle;
    }

    public void incrementAngle() {
        angle = angle + 1;
    }

    public void decrementAngle() {
        angle = angle - 1;
    }
}
