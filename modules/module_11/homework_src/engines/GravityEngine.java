package engines;

import models.GameModel;

/**
 * Engine which applies the force of gravity to items within the game.
 */
public class GravityEngine {
    public void updateState(GameModel state) {
        double oldYVelocity = state.getBall().getyVelocity();
        state.getBall().setyVelocity(oldYVelocity - .1);
    }
}
