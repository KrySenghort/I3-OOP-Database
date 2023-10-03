import java.util.Scanner;

public class Library {
  Book[] books = new Book[] {
      new Book("OOP", 123456789),
      new Book("Database", 1234567890),
      new Book("Network", 0432443453)
  };
  Scanner keyborad = new Scanner(System.in);

  public int menu() {
    System.out.println("1. List books");
    System.out.println("2. Search book by title");
    System.out.println("3. Borrow book");
    System.out.println("4. Return book");
    System.out.println("5. Exit.");
    System.out.println("Choose an option : ");
    int option;
    do {
      while (!keyborad.hasNextInt()) {
        keyborad.nextLine();
      }
      option = keyborad.nextInt();
      keyborad.nextLine();
      if (option < 1 || option > 5) {
        System.out.println("Invalid option.");
      }
    } while (option < 1 || option > 5);
    return option;
  }

  public void ListBook() {
    System.out.println("----------------- Book List ------------------");
    for (int i = 0; i < books.length; i++) {
      System.out.printf("%2d. %s (%ld)", i + 1, books[i].title, books[i].isbn);
    }
  }

  public static void main(String[] args) {
    Library lib = new Library();
    switch (lib.menu()) {
      case 1:
        lib.ListBook();
        break;
    }
  }
}
