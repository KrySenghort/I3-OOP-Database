import java.lang.Math;

public class BoxV1 {
  // setter
  private double w, h, d; // access modifier
  // setter to check w,d,h

  public void setW(double w) {
    if (w > 0) {
      this.w = w;
    } else {
      throw new IllegalArgumentException("Width must be greater than 0");
    }
  }

  public void setH(double h) {
    if (h > 0) {
      this.h = h;
    } else {
      throw new IllegalArgumentException("Height must be greater than 0");
    }
  }

  public void setD(double d) {
    if (d > 0) {
      this.d = d;
    } else {
      throw new IllegalArgumentException("Distance must be greater than 0");
    }
  }

  public double Volume() {
    return w * h * d;
  }

  public double Area() {
    return (2 * w * h) + (2 * h * d) + (2 * w * d);
  }

  // =======================================================================================
  // BoxV1(double side) { // default constructor is the function that has no
  // parameter.
  // if (side > 0) {
  // double A = Math.pow(side, 2);
  // System.out.println("the area is " + A);
  // } else {
  // throw new IllegalArgumentException("side must be greater than 0");
  // }
  // }
  public BoxV1(double w, double h, double d) {
    setD(d);
    setH(h);
    setW(w);
  }

  public BoxV1() {

  }

  public String toString() {
    return String.format("w = %2f, h = %2f, d = %2f, volume = %f", w, h, d, Volume());
  }

}
