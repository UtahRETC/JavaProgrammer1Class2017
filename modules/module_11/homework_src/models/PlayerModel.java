package models;

/**
 * State object for the player.  Contains player height, position information
 * and whether or not the player is holding the ball.
 */
public class PlayerModel {
    private int height = 150;
    private int x;
    private int y = 0;
    private double xVelocity = 0;
    private double yVelocity = 0;
    private BallModel heldBall = null;

    public PlayerModel(int x) {
        this.x = x;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHolding(BallModel ball) {
        return heldBall != null && heldBall.equals(ball);
    }

    public void hold(BallModel ball){
        heldBall = ball;
    }

    public void letGoOfBall() {
        heldBall = null;
    }
}
