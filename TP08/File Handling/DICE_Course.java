import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Create a class Course represents all courses in DICE.
// Then create a program with a menu:
// 1. List all courses
// 2. Find courses by name
// 3. Add new course
// 4. Quit
public class DICE_Course {
  public static void main(String[] args) {
    int choice;
    File file = new File("CourseList.txt");
    ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
    Scanner scan = new Scanner(System.in);
    System.out.println("=========================================================================");
    System.out.println("The method of DICE's Courses are showing below : ");
    do {
      System.out.println("\n=========================================================================");
      String[] Courses = { "List all courses ", "Find courses by name", "Add new course", "Quit System" };
      for (int i = 0; i < Courses.length; i++) {
        System.out.println(i + " : " + Courses[i]);
      }
      System.out.println("=========================================================================");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          ArrayList<String> list0 = new ArrayList<>();
          list0.add("Computer Architecture");
          list0.add("Algorithm");
          list0.add("Distributed System");
          list0.add("Automata");
          list0.add("Network");
          list0.add("OOP");
          list0.add("Database");
          list0.add("Web-Programming");
          list0.add("Artificial Intelligent");
          list0.add("Machine Learning");
          list0.add("Modeling and Simulation");
          list0.add("Methodology");
          list0.add("Mobile App");
          list0.add("Remote Sensing");
          list0.add("Natural Language Processing");
          list0.add("Deep Learning");
          list0.add("Discrete Mathematics");
          System.out.println("The list of all course in DICE are shown below : ");
          Iterator itr0 = list0.iterator();
          while (itr0.hasNext()) {
            System.out.print(itr0.next() + ", ");
          }
          break;
        case 2:
          System.out.println("Enter the name of course : ");
          String CourSe = scan.next();
          Iterator itr1 = list0.iterator;
          if(CourSe==itr0.next()){


          }

      }
    } while (choice != 4);

  }

}
