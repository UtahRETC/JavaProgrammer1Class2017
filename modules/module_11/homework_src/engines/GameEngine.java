package engines;

import models.BallModel;
import models.GameModel;
import models.PlayerModel;
import models.ShotModel;

/**
 * Top level engine that drives the changes in the game.
 */
public class GameEngine {
    private GravityEngine gravityEngine = new GravityEngine();
    private MovementEngine movementEngine = new MovementEngine();

    public void updateState(GameModel state, String input) {
        gravityEngine.updateState(state);
        updateFromUserInput(state, input);
        movementEngine.updateState(state);
    }

    private void updateFromUserInput(GameModel state, String input) {
        if (input != null) {
            switch (input) {
                case "ARROW_UP":
                    state.getShot().incrementAngle();
                    break;
                case "ARROW_DOWN":
                    state.getShot().decrementAngle();
                    break;
                case "ARROW_LEFT":
                    state.getShot().decrementPower();
                    break;
                case "ARROW_RIGHT":
                    state.getShot().incrementPower();
                    break;
                case "SPACEBAR":
                    shootBall(state.getPlayer(), state.getBall(), state.getShot());
                    break;
                case "ENTER":
                    state.getPlayer().hold(state.getBall());
                    break;
            }
        }
    }

    /**
     * Calculates the vertical velocity and the horizontal velocity imparted by the give power and angle
     * and applies that to the ball.  Also makes the player let go of the ball.
     */
    private void shootBall(PlayerModel player, BallModel ball, ShotModel shot) {
        double xVelocity = shot.getPower() * Math.cos(Math.toRadians(shot.getAngle()));
        double yVelocity = shot.getPower() * Math.sin(Math.toRadians(shot.getAngle()));
        ball.setxVelocity(xVelocity);
        ball.setyVelocity(yVelocity);
        player.letGoOfBall();
    }
}
