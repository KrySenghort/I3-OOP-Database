
// Using previously created class Book as references and reuse it. Create new class name Category 
// represents category of the book. The category class should have:
// 1.	Name, Description, ArrayList of Books
// 2.	Data input to create new category
// 3.	Data input to add/remove book(s) in the category
// 4.	Method to list all books
// 5.	Find books in this category (by ISBN or Title)
// 6.	Count books in this category
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem04BookCategoriesClass extends Problem03BookClass {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter new category : ");
    String category = scan.next();
    ArrayList<String> l2 = new ArrayList<>();
    l2.add(category);

  }

}
