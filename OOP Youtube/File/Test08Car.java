public class Test08Car extends Test08InheritanceSuper {
  // method
  public void show() {
    super.display();
    System.out.println("This is car method. The speed of the car is " + super.speed);
  }

  public Test08Car() {
    super("Toyota");
    System.out.println("This is a car.");
  }
}
