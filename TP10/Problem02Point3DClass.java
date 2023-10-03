import java.util.Scanner;
import java.lang.Math;

// Implement the “Point3D” class. One should store the coordinates x, y, z in the attributes. 
//Implement methods for a data input, for a data output, implement the accessors and mutators.
public class Problem02Point3DClass {
  private double x;
  private double y;
  private double z;

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void setZ(double z) {
    this.z = z;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getZ() {
    return z;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter x, y, z : ");
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    double z = scan.nextDouble();
    Problem02Point3DClass b = new Problem02Point3DClass();
    b.setX(x);
    b.setY(y);
    b.setZ(z);
    System.out.println("The three coordinates (x,y,z) = (" + b.getX() + ", " + b.getY() + ", " + b.getZ() + ")");
    System.out.print("The distance of this three point of these three corrdinates : ");
    System.out.print(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));

  }
}
