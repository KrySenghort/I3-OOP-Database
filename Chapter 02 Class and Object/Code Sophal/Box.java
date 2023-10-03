public class Box {
  public double w, h, d; //

  double Volume(double w, double h, double d) {
    this.w = w;
    this.h = h;
    this.d = d;
    return w * d * h;
  }

  public double Area() {
    double area = 2 * (h * w + w * d + d * h);
    return area;
  }
}
