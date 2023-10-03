public class Test05MainEncapsulation {
  public static void main(String[] args) {
    // Encapsulation Application : we often use method get(), set() -> public
    Test05Encapsulation user = new Test05Encapsulation();
    user.setID(1);
    user.setUsername("Kry Senghort");
    user.setEmail("Senghortkry@gmail.com");
    user.setPassword("e20200706");
    // method get
    System.out.println("ID : " + user.getId());
    System.out.println("Username : " + user.getUsername());
    System.out.println("Email : " + user.getEmail());
    System.out.println("Password : " + user.getPassword());
  }
}
