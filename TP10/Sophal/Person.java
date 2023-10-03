import java.time.LocalDate;
import java.time.Period;

public class Person {
  protected String Fname;
  protected String Lname;
  protected String gender;
  LocalDate dob;

  public void setFname(String Fname) {
    this.Fname = Fname;
  }

  public String GetFname() {
    return Fname;
  }

  public void setLname(String name2) {
    this.Lname = name2;
  }

  public String GetLname() {
    return Lname;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String GetGender() {
    return gender;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public int GetDob() {
    Period p = Period.between(dob, LocalDate.now());
    return p.getYears();
  }
}
