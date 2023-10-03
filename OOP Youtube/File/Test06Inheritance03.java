public class Test06Inheritance03 extends Test06Inheritance02 {
  protected int sum(int a, int b, int c) {
    int result = a + b + c;
    return result;
  }

  protected String Name;
  protected int ID;

  Test06Inheritance03(String Name, int ID) {
    this.ID = ID;
    this.Name = Name;
  }

  public int displayID() {
    return ID;
  }

  protected String displayName() {
    return Name;
  }

}
