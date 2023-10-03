public class BankAccount {
  double balance; // amount of money
  String accountName; // ex: Kry Senghort
  String accountNumber;// ex: 001 000 000

  public BankAccount(double balance, String accountName, String accountNumber) {
    this.balance = balance;
    this.accountName = accountName;
    this.accountNumber = accountNumber;
  }

  public static void main(String[] args) {
    BankAccount p1 = new BankAccount(12220, "Senghort", "123456");
    System.out.println("Bank Balance = " + p1.accountName);
    System.out.println("Bank account name : " + p1.accountName);
    System.out.println("Bank account number : " + p1.accountNumber);
  }
}
