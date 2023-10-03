public class Visibility {
  short age = 19; // attribute.

  public void methodA() {
    int age = 20; // local variable
    if (age >= 20) {
      System.out.println("Age is " + this.age);
      // " this " is used to connect the name of variables that are same or
      // the first variable that is global variable.
    }
  }

  double minimum(double a, double b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Visibility A = new Visibility();
    A.methodA();

  }
}
