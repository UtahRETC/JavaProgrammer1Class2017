package renderers;

import models.HoopModel;

import java.awt.*;

/**
 * Renderer for the basketball hoop.
 */
public class HoopRenderer {
    int strokeWidth = 8;
    public void render(HoopModel hoop, Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(strokeWidth));
        int offsetFromGround = -hoop.getY();
        int y = canvasSize.height - groundHeight + offsetFromGround;
        int x = canvasSize.width - strokeWidth;
        graphics.drawLine(x, y, x, y - hoop.getHeight());
        int basketY = y - hoop.getHeight() + 60;
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(x - strokeWidth, basketY, x - hoop.getHoopDiameter(), basketY);
    }
}
