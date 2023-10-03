import java.util.Scanner;

public class Problem04 {
  public static void main(String[] args) {
    // // ============= Exercise 04:
    // Create classes to support each currency. Write a program in Java to exchange
    // money in Riels to Dollar, Riels to Thai Baht,
    // Dollar to Riels, Dollar to Thai Baht, and Thai Baht to Riels. Suppose that
    // conversion rate is 1$ = 4000៛, and 1$ = 30B.
    // Welcome to program Money Exchanges!
    // 1. Riels to Dollar
    // 2. Riels to Thai Baht
    // 3. Dollar to Riels
    // 4. Dollar to Thai Baht
    // 5. Thai Baht to Riels
    // 6. Exit
    System.out.print("Welcome to program money exchanges !");
    System.out.print("\n1. Riels to Dollar");
    System.out.print("\n2. Riels to Baht");
    System.out.print("\n3. Dollar to Riels");
    System.out.print("\n4. Dollar to Baht");
    System.out.print("\n5. Baht to Riels");
    System.out.print("\n6. Exit");
    Scanner scan = new Scanner(System.in);
    System.out.print("\nSelect an option : ");
    int choice = scan.nextInt();
    switch (choice) {
      case 1:
        System.out.print("Enter money(Riels) : ");
        float Riels = scan.nextFloat();
        float Dollar = Riels / 4000;
        System.out.print(Riels + " Riels = " + Dollar + " USD");
        break;
      case 2:
        System.out.print("Enter money(Riels) :");
        Riels = scan.nextFloat();
        float Baht = 30 * Riels / 4000;
        System.out.print(Riels + " Riels = " + Baht + " Baht");
        break;
      case 3:
        System.out.print("Enter money(Dollar) :");
        Dollar = scan.nextFloat();
        Riels = Dollar * 4000;
        System.out.print(Dollar + " USD = " + Riels + " Riels");
        break;
      case 4:
        System.out.print("Enter money(Dollar) :");
        Dollar = scan.nextFloat();
        Baht = Dollar * 30;
        System.out.print(Dollar + " USD = " + Baht + " Baht");
        break;
      case 5:
        System.out.print("Enter money(Baht) :");
        Baht = scan.nextFloat();
        Riels = Baht * 4000 / 30;
        System.out.print(Baht + " Baht = " + Riels + " Riels");
      case 6:
        break;
      default:
        System.out.println("invalid choice");
        break;
    }
  }
}
