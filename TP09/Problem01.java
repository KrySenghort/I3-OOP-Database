import java.util.Scanner;

// Create a class RectangleTest that is a Java application that test:
// 1. Create an instance of class Rectangle (call its constructor)
// 2. Display perimeter of it (the new created rectangle object)
// 3. Display surface of it (the new created rectangle object)
public class Problem01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter width : ");
    int a = scan.nextInt();
    System.out.print("Enter height : ");
    int b = scan.nextInt();
    Rectangle01 x = new Rectangle01(a, b);
    System.out.println("The perimeter of rectangle is " + x.calculatePerimeter() + "m");
    System.out.println("The surface of rectangle is " + x.calculateSurface() + "m^2");
  }
}