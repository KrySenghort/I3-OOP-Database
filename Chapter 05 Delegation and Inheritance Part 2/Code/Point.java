import java.awt.Color;

public class Point {
  double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
}

class PointGraphic extends Point {
  Color c;

  public PointGraphic(double x, double y, Color c) {
    super(x, y);
    this.c = c;
  }
}