public class test1 {
  public static void main(String[] args) {
    // System.out.println("Hello, World! how are you today ?");
    // System.out.println("I am a student at ITC.");
    // System.out.println("Do you learn with me at this home ?");
    // System.out.println("My friend is a doctor and scientist of ITC.");
    person p1 = new person();
    p1.id = 1;
    p1.name = "Senghort";
    p1.salary = 234;

    person p2 = new person();
    p2.name = "Saray";
    p2.id = 2;
    p2.salary = 323;

    person p3 = new person();
    p3.id = 3;
    p3.name = "Dara Seyhak";
    p3.salary = 1200;

    p1.show();
    p2.show();
    p3.show();
  }
}

class person {
  int id;
  String name;
  float salary;

  void show() {
    System.out.printf("\nID is %d\nName is %s\nSalary is %f", id, name, salary);
  }
}
