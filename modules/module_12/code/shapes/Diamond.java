import java.awt.*;
import java.awt.geom.GeneralPath;

public class Diamond extends CanvasShape {
  public Diamond(int topLeftX, int topLeftY, int width, int height) {
    super(topLeftX, topLeftY, width, height);
  }
  
  public void render(Graphics2D graphics) {
    graphics.setColor(Color.WHITE);
    GeneralPath path = new GeneralPath();
    path.moveTo(getTopLeftX() + (getWidth() * 0.5), getTopLeftY()); // top
    path.lineTo(getTopLeftX() + getWidth(), getTopLeftY() + (getHeight() * 0.5)); // right
    path.lineTo(getTopLeftX() + (getWidth() * 0.5), getTopLeftY() + getHeight()); // bottom
    path.lineTo(getTopLeftX(), getTopLeftY() + (getHeight() * 0.5)); // left
    path.closePath();
    graphics.fill(path);
  }
}
