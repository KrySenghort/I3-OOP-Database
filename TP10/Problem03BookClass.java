
// Create a Java class represents Book information in GIC library. Class contains all needed information 
// for librarian and students to:
// 1.	Search (by title, description, category (math, Java, etc.), isbn, author(s), published date…)
// 2.	Check availability for borrow
// 3.	Check number of books in inventory
// 4.	Decrease/Increase number of books in inventory
// 5.	Borrow (some books can be borrowed, some cannot)
// The class Book need methods:
// 1.	Data input (user input from keyboard to create new book)
// 2.	Display book information
// Note: This class should prevent all type of errors of input by user.
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem03BookClass implements Serializable {
  private String title;
  private String description;
  private String category;
  private long isbn;
  private String author;
  private String publishedDate;

  public Problem03BookClass() {

  }

  public Problem03BookClass(long isbn, String title, String description, String category, String author,
      String publishedDate) {
    this.author = author;
    this.category = category;
    this.isbn = isbn;
    this.title = title;
    this.description = description;
    this.publishedDate = publishedDate;
  }

  public String DisplayBook() {
    return title + " " + description + " " + category + " " + isbn + " " + author + " " + publishedDate;
  }

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    Problem03BookClass a = new Problem03BookClass(0, null, null, null, null, null);
    File file = new File("BookClass.txt");
    ArrayList<Problem03BookClass> al = new ArrayList<Problem03BookClass>();
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    ListIterator li = null;
    int choice;
    ArrayList<Problem03BookClass> l1 = new ArrayList<Problem03BookClass>();
    ois = new ObjectInputStream(new FileInputStream(file));
    al = (ArrayList<Problem03BookClass>) ois.readObject();
    l1.add(new Problem03BookClass(978000001, "A", "Algorithm", "a", "dara", "12-Jan-2002"));
    l1.add(new Problem03BookClass(978000002, "B", "Electronic", "e", "senghort", "23-Feb-2003"));
    l1.add(new Problem03BookClass(978000003, "C", "Project-Data", "a", "paharith", "12-Apr-1999"));
    l1.add(new Problem03BookClass(978000004, "D", "Electronic-Circuit", "e", "dalish", "21-Dec-1979"));
    l1.add(new Problem03BookClass(978000005, "E", "Web-Programming", "b", "sengly", "12-Nov-1990"));
    l1.add(new Problem03BookClass(978000006, "F", "Machine-Learning", "c", "sunheng", "31-June-1978"));
    l1.add(new Problem03BookClass(978000007, "G", "Automation", "d", "visal", "23-Feb-2001"));
    l1.add(new Problem03BookClass(978000008, "H", "OOP", "a", "mouryhong", "24-Feb-2012"));
    l1.add(new Problem03BookClass(978000009, "I", "NetworkI", "d", "seanglong", "30-Mar-2002"));
    l1.add(new Problem03BookClass(978000010, "J", "Mobile-App", "b", "chanleap", "23-May-2002"));
    l1.add(new Problem03BookClass(978000011, "K", "Computer-Design", "f", "panha", "12-Mar-1989"));
    l1.add(new Problem03BookClass(978000012, "L", "Discrete-Math", "g", "vandy", "15-Apr-1975"));
    l1.add(new Problem03BookClass(978000013, "M", "Supervised-Learn", "c", "rotha", "12-May-1967"));
    l1.add(new Problem03BookClass(978000014, "N", "Unsupervised-Learn", "c", "chhaina", "26-Jan-2007"));
    l1.add(new Problem03BookClass(978000015, "O", "Operating-System", "f", "senglay", "20-Apr-2003"));
    l1.add(new Problem03BookClass(978000016, "P", "AI", "c", "kimhoung", "16-Oct-2002"));
    l1.add(new Problem03BookClass(978000017, "Q", "Python", "c", "kimlang", "12-Dec-2003"));
    l1.add(new Problem03BookClass(978000018, "R", "Remote-Sensing", "c", "kimhong", "11-Nov-1948"));
    l1.add(new Problem03BookClass(978000019, "S", "Image-Processing", "c", "leakhena", "12-Oct-1934"));
    l1.add(new Problem03BookClass(978000020, "T", "Distributed-System", "f", "rothana", "23-Feb-1990"));
    l1.add(new Problem03BookClass(978000021, "U", "Parallel-Computing", "f", "tola", "27-Mar-1974"));
    l1.add(new Problem03BookClass(978000022, "V", "Database ", "a", "tongheang", "27-Apr-2001"));
    l1.add(new Problem03BookClass(978000023, "W", "Java-Programing", "b", "kimhean", "26-Feb-1996"));
    l1.add(new Problem03BookClass(978000024, "X", "Java-Application", "b", "thina", "18-Mar-2001"));
    l1.add(new Problem03BookClass(978000025, "Y", "Java-Developer", "b", "sreypich", "19-Feb-2001"));
    l1.add(new Problem03BookClass(978000026, "Z", "Cloud-Computing", "f", "sreypov", "13-Jan-2002"));
    l1.add(new Problem03BookClass(978000027, "AA", "Computer-Organization", "f", "piseth", "08-Jan-21"));
    l1.add(new Problem03BookClass(978000028, "BB", "NetworkII", "d", "vathanak", "08-Feb-2019"));
    l1.add(new Problem03BookClass(978000029, "CC", "C/C++ Programming", "a", "monyroth", "24-Mar-2020"));
    l1.add(new Problem03BookClass(978000030, "DD", "HTML/CSS", "b", "leapheng", "12-Aug-1999"));
    ois.close();
    do {
      ArrayList<String> list0 = new ArrayList<>();
      list0.add("[1]. Number of Book");
      list0.add("[2]. Borrow book");
      list0.add("[3]. Search Book using isbn");
      list0.add("[4]. Search Book using title");
      list0.add("[5]. Search book using category");
      list0.add("[6]. Search book using description");
      list0.add("[7]. Search book using author");
      list0.add("[8]. Search book using publishDate");
      list0.add("[9]. Insert data");
      list0.add("[10]. Delete data");
      list0.add("[11]. Display data");
      list0.add("[12]. Exit");
      Iterator itr0 = list0.iterator();
      while (itr0.hasNext()) {
        System.out.println(itr0.next() + ", ");
      }
      System.out.print("Enter your choice : ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          int sum = 0;
          for (int i = 0; i <= al.size(); i++) {
            sum = sum + i;
          }
          System.out.println("the number of book is : " + sum);
          ois.close();
          break;
        case 2:
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          System.out.println("Welcome to borrow book");
          System.out.println("Enter isbn of book : ");
          long isbn = scan.nextLong();
          if (a.isbn == isbn) {
            System.out.println("It is availabile");
          } else {
            System.out.println("It is unavailable");
          }
          ois.close();
          break;
        case 3: // search using isbn
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          boolean found = false;
          System.out.println("Enter isbn to search : ");
          isbn = scan.nextLong();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.isbn == isbn) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 4: // search using title
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter title to search : ");
          String title = scan.next();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.title == title) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 5: // search using category
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter category to search : ");
          String category = scan.next();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.category == category) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 6: // search using description
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter description to search : ");
          String description = scan.next();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.description == description) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 7: // search using author
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter author to search : ");
          String author = scan.next();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.author == author) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 8: // search using publish date
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter title to search : ");
          String publishedDate = scan.next();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.publishedDate == publishedDate) {
              System.out.println(e);
              found = true;
            }
          }
          ois.close();
          break;
        case 9:
          oos = new ObjectOutputStream(new FileOutputStream(file));
          oos.writeObject(al);
          System.out.println("Enter how many book do you want to add : ");
          int n = scan.nextInt();
          for (int i = 0; i < n; i++) {
            System.out.println("Enter book's isbn : ");
            isbn = scan.nextLong();
            System.out.println("Enter book's title : ");
            title = scan.next();
            System.out.println("Enter book's description : ");
            description = scan.next();
            System.out.println("Enter book's category : ");
            category = scan.next();
            System.out.println("Enter book's author : ");
            author = scan.next();
            System.out.println("Enter publish date : ");
            publishedDate = scan.next();
            al.add(new Problem03BookClass(isbn, title, description, category, author, publishedDate));
          }
          oos.close();
          break;
        // ===========================================================================================
        case 10:
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          found = false;
          System.out.println("Enter isbn to Delete : ");
          isbn = scan.nextLong();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext()) {
            Problem03BookClass e = (Problem03BookClass) li.next();
            if (e.isbn == isbn) {
              li.remove();
              System.out.println(e);
              found = true;
            }
          }
          if (found) {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(al);
            oos.close();
            System.out.println("Record deleted successfully...!");
          } else {
            System.out.println("Record deleted successful");
          }
          System.out.println("--------------------------------------------------");
          ois.close();
          break;
        // ===========================================================================================
        case 11:
          ois = new ObjectInputStream(new FileInputStream(file));
          al = (ArrayList<Problem03BookClass>) ois.readObject();
          System.out.println("================================================");
          li = al.listIterator();
          while (li.hasNext())
            System.out.println(li.next());
          System.out.println("================================================");
          ois.close();
          break;
        // ===========================================================================================
      }
    } while (choice != 8);
  }

}
