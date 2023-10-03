// constructor is a special method that name is same as class's name. 
// It has not returned value.
// constructor that has no parameter inside is called as default constructor.
// constructor that has parameter insider is called as implicit constructor.
// It is used to initialize or set the value of attribute inside of object when
// we create object.
public class Point {
  int x, y; // attribute

  Point(int x1, int y1) {
    System.out.println("Constructing..." + x1 + "," + y1);
    x = x1;
    y = y1;
  }

  Point(int _x) {
    this(_x, 0);
  }

  Point() {
    this(0, 90);
  }

  // Polyconstructor is the multiple constructor of the class.
  void show() {
    System.out.printf("Point (%d, %d)", x, y);
  }

  void show(Point p1) {
    this.show();
    p1.show();
  }

  // Overloading method is the multiple method that has the same name but
  // different with parameters inside or index of parameter.
  public static void main(String[] args) {
    Point p1 = new Point(8, 20);
    p1.show();
    Point p2 = new Point(59);
    p1.show(p2);

  }
}
// we can assign the value in this constructor without p1.x or p1.y to create
// obj.
