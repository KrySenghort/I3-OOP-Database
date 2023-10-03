public class Book {
  String title;
  long isbn; // 10 or 14 digits

  public Book(String title, long isbn) {
    this.title = title;
    this.isbn = isbn;
  }

  boolean isAvailable = true;

  public boolean borrow() {
    if (isAvailable) {
      return false; // can't be borrowed
    }
    isAvailable = false;
    return true;
  }

  public void returnBook() {
    isAvailable = true;
  }

}