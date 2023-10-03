public class Test03MainUser {
  public static void main(String[] args) {
    // Class User Application
    Test03User user1 = new Test03User();
    user1.Username = "Kry Senghort";
    // user.Email = "Senghortkry@gmail.com";
    // We cannot use Email because it is private data.
    user1.Password = "e20200706";
    user1.Register("Dara", "Dara@gmail.com", "Student", "Dara123");
    user1.GetInfo();
    System.out.println("-------------------------------------------------------------");
    Test03User user2 = new Test03User();
    user2.Register("Chan", "Chan@gmail.com", "Student", "chan123");
    user2.GetInfo();

  }
}
