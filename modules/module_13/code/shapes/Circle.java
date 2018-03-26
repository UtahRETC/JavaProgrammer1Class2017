import java.awt.*;

public class Circle extends CanvasShape {
  public Circle(int topLeftX, int topLeftY, int width, int height) {
    super(topLeftX, topLeftY, width, height);
  }

  public void render(Graphics2D graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillOval(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
  }
}
