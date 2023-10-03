public class Test03User {
  // State (Username, Email, Role, Password)
  public String Username;
  private String Email;
  protected String Role;
  String Password;

  // Behavior{ Register() and GetInfo() }
  void Register(String name, String email, String role, String password) {
    Username = name;
    Email = email;
    Role = role;
    Password = password;
  }

  public void GetInfo() {
    System.out.println("Name : " + Username);
    System.out.println("Email : " + Email);
    System.out.println("Role : " + Role);
    System.out.println("Password : " + Password);
  }
}
