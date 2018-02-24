import java.awt.Graphics2D;

public class CanvasShape {
  private int topLeftX;
  private int topLeftY;
  private int width;
  private int height;
  
  public CanvasShape(int topLeftX, int topLeftY, int width, int height) {
    this.topLeftX = topLeftX;
    this.topLeftY = topLeftY;
    this.width = width;
    this.height = height;
  }
  
  public int getTopLeftX() { return topLeftX; }
  public int getTopLeftY() { return topLeftY; }
  public int getWidth() { return width; }
  public int getHeight() { return height; }
  
  // public void setTopLeftX(int topLeftX) {
  //   this.topLeftX = topLeftX;
  // }
  //
  // public void setTopLeftY(int topLeftY) {
  //   this.topLeftY = topLeftY;
  // }
  //
  // public void setWidth(int width) {
  //   this.width = width;
  // }
  //
  // public void setHeight(int height) {
  //   this.height = height;
  // }
  
  public void render(Graphics2D graphics) {
    throw new RuntimeException("You can't call the render method directly for the Shape class! You need to override it in a subclass.");
  }
}
