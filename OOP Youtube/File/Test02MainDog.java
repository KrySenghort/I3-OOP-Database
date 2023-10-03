public class Test02MainDog {
  public static void main(String[] args) {
    // Class Dog Application
    System.out.print("Hello world");
    System.out.print("\n=====================================================");
    // to create object from class dog
    Test02Dog dog1 = new Test02Dog();
    dog1.bark();
    dog1.eat();
    dog1.sleep();
    System.out.println("Name is " + dog1.name);
    System.out.println("Age is " + dog1.age);
    System.out.println("Color is " + dog1.color);
    System.out.println("-------------------------------------------");
    Test02Dog dog2 = new Test02Dog();
    dog2.bark();
    dog2.eat();
    dog2.sleep();
    System.out.println("Name is " + dog2.name);
    System.out.println("Age is " + dog2.age);
    System.out.println("Color is " + dog2.color);
    System.out.println("-------------------------------------------");
  }
}
