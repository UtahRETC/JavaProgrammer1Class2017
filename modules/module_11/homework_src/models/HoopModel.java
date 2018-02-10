package models;

/**
 * State object for the basketball hoop.  Contains position information,
 * pole height and the hoop diameter.
 */
public class HoopModel {
    private int x = 0;
    private int y = 0;
    private int height = 250;
    private int hoopDiameter = 50;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getHoopDiameter() {
        return hoopDiameter;
    }
}
