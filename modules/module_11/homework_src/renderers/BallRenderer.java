package renderers;

import models.BallModel;

import java.awt.*;

/**
 * Renderer for the ball.
 */
public class BallRenderer {

    public void render(BallModel ball, Graphics2D graphics, Dimension canvasSize, int groundHeight){
        graphics.setColor(Color.orange);
        double ballOffsetFromGround = -ball.getY();
        double y = canvasSize.height - groundHeight + ballOffsetFromGround - ball.getDiameter();
        graphics.fillOval((int)Math.round(ball.getX()), (int)Math.round(y), ball.getDiameter(), ball.getDiameter());
    }
}
