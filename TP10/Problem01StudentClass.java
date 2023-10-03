
// Implement the “Student” class. It’s necessary to save in the attributes the following data: name, date of birth, 
// telephone number, city, country, the group (A, B, …). Do the following tasks:
// 1.	Implement the methods for a data input (read from keyboard and fill in the fields), for a data output, 
// 2.	implement the accessors (ex: getName() is accessor of name field) to access the separate attributes,
// 3.	Implement the mutators (ex: setName(String name) is mutators of name field).
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Problem01StudentClass {
  private String name;
  String Dob;
  private long phone;
  private String city;
  private String country;
  private String group;

  public Problem01StudentClass(String name, String dob, long phone, String city, String country, String group) {
    this.name = name;
    this.Dob = dob;
    this.phone = phone;
    this.city = city;
    this.country = country;
    this.group = group;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDob(String dob) {
    this.Dob = dob;
  }

  public String getDob() {
    return Dob;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

  public long getPhone() {
    return phone;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getGroup() {
    return group;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = scan.nextLine();
    System.out.println("Enter your date of birth : ");
    String dob = scan.next();
    System.out.println("Enter your phone number : ");
    long phone = scan.nextLong();
    System.out.println("Enter your city : ");
    String city = scan.next();
    System.out.println("Enter your country : ");
    String country = scan.next();
    System.out.println("Enter your group : ");
    String group = scan.next();
    Problem01StudentClass a = new Problem01StudentClass(name, dob, phone, city, country, group);
    a.setName(name);
    a.setDob(dob);
    a.setPhone(phone);
    a.setCity(city);
    a.setCountry(country);
    a.setGroup(group);
    System.out.println("================================= Student's Information =================================");
    System.out.println("Name \t\t: " + a.getName());
    System.out.println("Date of birth \t: " + a.getDob());
    System.out.println("Phone Number \t: " + a.getPhone());
    System.out.println("City \t\t: " + a.getCity());
    System.out.println("Country \t: " + a.getCountry());
    System.out.println("Group \t\t: " + a.getGroup());

  }
}
