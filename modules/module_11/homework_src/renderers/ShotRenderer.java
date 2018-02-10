package renderers;

import models.ShotModel;

import java.awt.*;

/**
 * Renderer for the shot. (the text and numbers below the ground)
 */
public class ShotRenderer {
    public void render(ShotModel shot, Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(3));
        graphics.setFont(graphics.getFont().deriveFont(Font.BOLD).deriveFont(36.5f));
        int y = canvasSize.height - groundHeight/2;
        graphics.drawString("Power: " + shot.getPower(), 300, y);
        graphics.drawString("Angle: " + shot.getAngle(), 700, y);
    }
}
