import java.lang.Math;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Overloading2 {
  public double x;
  public double y;
  public double ESP = 0.01;

  public void show() {
    System.out.println("Point1(" + x + "," + y + ")");
  }

  // Constructor
  Overloading2(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Overloading method
  public double distance() {
    double d = Math.sqrt(x * x + y * y);
    return d;
  }

  public double distance(Overloading2 p) {
    double d = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow((y - p.y), 2));
    // x,y belong to overloading2(x:0,y:5)
    // p.x,p.y belong to overloading2(x:0,y:3)
    return d;
  }

  public boolean equal(Overloading2 p2) {
    Overloading2 p = (Overloading2) p2;
    double dx = Math.abs(x - p.x);
    double dy = Math.abs(y - p.y);
    if (dx <= ESP && dy < ESP) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter point1 : ");
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();
    System.out.println("Enter point2 : ");
    double x2 = scan.nextDouble();
    double y2 = scan.nextDouble();
    Overloading2 p1 = new Overloading2(x1, y1);
    Overloading2 p2 = new Overloading2(x2, y2);

    System.out.println("(0,0)->(" + x1 + "," + y1 + ") = " + p1.distance());
    System.out.println("(" + x1 + "," + y1 + ")->" + "(" + x2 + "," + y2 + ") = " + p1.distance(p2));

    System.out.println("(0,0)->(" + x2 + "," + y2 + ") = " + p1.distance());
    System.out.println("(" + x2 + "," + y2 + ")->" + "(" + x1 + "," + y1 + ") = " + p2.distance(p1));

    Overloading2 p3 = new Overloading2(0, 5);
    Overloading2 p4 = new Overloading2(0, 3);
    System.out.println("(0,0)->(0,5) =" + p3.distance());
    System.out.println("(0,5)->(0,3) = " + p3.distance(p4));
    // (0,0)->(0,5) = 5.0
    // (0,5)->(0,3) = 2.0
    System.out.println("(0,0)->(0,3) = " + p4.distance());
    System.out.println("(0,3)->(0,5) = " + p4.distance(p3));
    // (0,0)->(0,3) = 3.0
    // (0,3)->(0,5) = 2.0
    p1.show();
    p2.show();

    // Overloading.ESP = 0.001; is the static variable of class.
    p1.ESP = p2.ESP = 0.001;
    System.out.printf("p1.ESP=%f , p2.ESP=%f", p1.ESP, p2.ESP);

    if (p1.equal(p2)) {
      System.out.println("\np1 is equals to p2");
    } else {
      System.out.println("\np1 is not equal to p2");
    }
    if (p2.equal(p1)) {
      System.out.println("p2 is equal to p1");
    } else {
      System.out.println("p2 is not equal to p1");
    }
    System.out.print("The name of class is : " + Overloading2.class.getName());
    Overloading2.class.getSuperclass();

    Field fx = Overloading2.class.getField("ESP");
    System.out.println("\nThe name of field is : " + fx.getName());
  }

}
// Enter point1 :
// 5.001
// 8.26
// Enter point2 :
// 5
// 8.261

// (0,0)->(5.001,8.26) = 9.655961940687215
// (5.001,8.26)->(5.0,8.261) = 0.0014142135623729393

// (0,0)->(5.0,8.261) = 9.655961940687215
// (5.0,8.261)->(5.001,8.26) = 0.0014142135623729393

// Point1(5.001,8.26)
// Point1(5.0,8.261)
// p1 is equals to p2
