package models;

/**
 * Contains all the state for the ball in the game.  This includes position
 * and current velocity.
 */
public class BallModel {
    private double x;
    private double y;
    private double xVelocity;
    private double yVelocity;
    private int diameter = 20;

    public double getyVelocity() {
        return yVelocity;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getLeftX(){
        return x;
    }

    public double getRightX() {
        return x + diameter;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getDiameter() {
        return diameter;
    }
}
