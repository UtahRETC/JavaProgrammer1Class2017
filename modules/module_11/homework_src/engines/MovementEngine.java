package engines;

import models.BallModel;
import models.GameModel;
import models.PlayerModel;

/**
 * Handles updating the state of all objects in the game that move.
 */
public class MovementEngine {
    public void updateState(GameModel state) {
        BallModel ball = state.getBall();
        PlayerModel player = state.getPlayer();
        if (player.isHolding(ball)) {
            ball.setX(player.getX() + 40);
            ball.setY(player.getY() + player.getHeight() -5);
        } else {
            ball.setY(ball.getY() + ball.getyVelocity());
            ball.setX(ball.getX() + ball.getxVelocity());
        }
    }
}
