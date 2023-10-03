import java.time.LocalDate;
import java.time.Month;

public class TestMain {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setFname("Senghort");
    s1.setLname("Kry");
    s1.setGender("male");
    s1.setDob(LocalDate.of(2000, Month.FEBRUARY, 15));
    s1.setFaculty("Applied Mathematics and Statistics");
    s1.setMajor("Data Science");
    System.out.println("\n============================ Student ===========================");
    System.out.println("Name = " + s1.GetFname() + "\tAge : " + s1.GetDob());

    Staff s2 = new Staff();
    s2.setFname("Dara");
    s2.setLname("San");
    s2.setGender("female");
    s2.setDob(LocalDate.of(2003, Month.JANUARY, 22));
    s2.setLocation("ITC");
    s2.setPosition("Statistician");
    System.out.println("\n============================ Staff =============================");
    System.out.println("Location : " + s2.getLocation() + "\tPosition : " + s2.getPosition());
    System.out.println("\n================================================================");
  }
}
