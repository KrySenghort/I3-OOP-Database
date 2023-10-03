public class Test08Main {
  public static void main(String[] args) {
    Test08InheritanceSuper test = new Test08InheritanceSuper();
    // It is the vehicle constructor....
    test.display();
    // This is a vehicle.
    System.out.println("Vehicle speed is : " + test.speed);
    // Vehicle speed is : 120

    Test08Car Test = new Test08Car();
    // It is the vehicle constructor...
    // This is a car.
    System.out.println("The car speed is " + Test.speed);
    // The car speed is 120.

  }
}
