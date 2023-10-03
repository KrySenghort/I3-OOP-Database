public class Staff extends Person {
  private String officeLocation;
  private String position;

  public void setLocation(String officeLocation) {
    this.officeLocation = officeLocation;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getLocation() {
    return officeLocation;
  }

  public String getPosition() {
    return position;
  }
}
