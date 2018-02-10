package renderers;

import models.PlayerModel;

import java.awt.*;

/**
 * Renderer for the player.
 */
public class PlayerRenderer {
    public void render(PlayerModel player, Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        int playerOffsetFromGround = -player.getY();
        int y = canvasSize.height - groundHeight + playerOffsetFromGround - player.getHeight();
        graphics.setColor(Color.BLUE);
        graphics.drawRect(player.getX(), y, 30, player.getHeight()  );
    }
}
