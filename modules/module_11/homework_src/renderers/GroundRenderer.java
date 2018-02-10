package renderers;

import models.GroundModel;

import java.awt.*;

/**
 * Renderer for the ground state object.
 */
public class GroundRenderer {

    public void render(GroundModel ground, Graphics2D graphics, Dimension canvasSize) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(3));
        int groundY = canvasSize.height - ground.getHeight();
        graphics.drawRect(0, groundY, canvasSize.width, canvasSize.height);
    }
}
