public class Test07MainInheritanceOverridingMethod {
  public static void main(String[] args) {
    Test07InheritanceOverridingMethod obj1 = new Test07InheritanceOverridingMethod();
    System.out.println(obj1.MessageGreeting());
    // Wish you
    Test07InheritanceOverridingMethod2 obj2 = new Test07InheritanceOverridingMethod2();
    System.out.println(obj2.MessageGreeting());
    // Wish you on your birthday.
  }
}
