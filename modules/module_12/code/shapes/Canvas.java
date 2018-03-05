import java.awt.*;

public class Canvas extends Component {

  private java.util.List<CanvasShape> shapes;

  public Canvas() {
    super();
    this.shapes = getShapes();
  }

  public java.util.List<CanvasShape> getShapes() {
    java.util.List<CanvasShape> s = new java.util.ArrayList<CanvasShape>();

    // TODO: add your shapes here!
    s.add(new Circle(100, 100, 200, 200));
    s.add(new Triangle(100, 300, 200, 200));

    return s;
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D graphics = (Graphics2D) g;
    Dimension canvasSize = getSize();

    g.setColor(Color.BLACK);
    graphics.fillRect(0, 0, canvasSize.width, canvasSize.height);

    for (CanvasShape shape : shapes) {
      shape.render(graphics);
    }
  }
}
