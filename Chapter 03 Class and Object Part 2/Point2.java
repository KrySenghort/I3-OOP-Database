public class Point2 {
  // attributes(global variable of class)
  double x, y;

  public Point2(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point2(double x) {
    this(x, 0);
  }

  // keyword "this" is used to called constructor of class and object.
  public Point2() {
    this(0, 0);
  }

}
