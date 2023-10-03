public class Test05Encapsulation {
  private int id;
  private String username;
  private String email;
  private String password;

  // Concept Encapsulation គឺត្រូវបានគេប្រើប្រាស់ដើម្បីលាក់នូវ Instance variable
  // ហើយគេអាចហៅប្រើបានដោយចាប់យក Method មក execute.
  // set->void with param
  public void setID(int id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // get -> return type no param
  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }
}
