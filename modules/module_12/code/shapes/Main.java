import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    Dimension dimension = new Dimension(600, 600);
    JFrame frame = new JFrame("Shapes");
    frame.setLocation(500, 150);
    frame.setPreferredSize(dimension);
    frame.setSize(dimension);
    frame.pack();
    frame.setResizable(false);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);

    Canvas canvas = new Canvas();
    canvas.setSize(600, 600);
    frame.add(canvas);
  }
}
