import java.lang.Math;

public class Point {
  double x;
  double y;

  private void show() {
    System.out.println("x=" + x + ",y=" + y);
  }

  public void translate(double dx, double dy) {
    x += dx;
    y += dy;
  }

  protected double distance() {
    return Math.sqrt(x * x + Math.pow(y, 2));
  }

  static void DoChange(Point p) {
    p.x += 9;
    p.y += 9;
  }

  void CoverChange() {
    DoChange(this);
  }

  public boolean IsCloserToOriginThan(Point p2) {
    if (distance() < p2.distance()) {
      return true;
    } else {
      return false;
    }
  }

  void foo(int x, Point p) {
    p = new Point();
    p.translate(10, 10);
  }

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = 3;
    p1.y = 4;
    p1.show();

    System.out.println(p1.distance()); // distance from 0,0
    p2.x = 7;
    p2.y = 99;
    p2.show();

    DoChange(p1);
    p1.show();
    System.out.println(p1.distance());

    if (p1.IsCloserToOriginThan(p2)) {
      System.out.println("p1 is further origin than p2");
    } else {
      System.out.println("p2 is further origin than p1");
    }

  }
}
