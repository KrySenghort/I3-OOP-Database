public class Test06MainInheritance {
  public static void main(String[] args) {
    // Inheritance concept :
    Test06Inheritance03 Animal = new Test06Inheritance03("Senghort", 1);
    Animal.eat();
    Animal.sleep();
    Animal.crawl();
    System.out.println(Animal.displayID());
    System.out.println(Animal.displayName());
    System.out.println(Animal.sum(2, 3, 5));
  }
}
// Inheritance03-->Inheritance02-->Inheritance03
