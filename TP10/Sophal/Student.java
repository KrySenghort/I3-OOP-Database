public class Student extends Person {
  private String Faculty;
  private String Major;

  public void setFaculty(String faculty) {
    this.Faculty = faculty;
  }

  public void setMajor(String major) {
    this.Major = major;
  }

  public String GetFaculty() {
    return Faculty;
  }

  public String GetMajor() {
    return Major;
  }
}
