import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee implements Serializable {
  int empno;
  String ename;
  int salary;

  Employee(int empno, String ename, int salary) {
    this.empno = empno;
    this.ename = ename;
    this.salary = salary;
  }

  public String toString() {
    return empno + " " + ename + " " + salary;
  }

  public static void main(String[] args) throws Exception {
    int choice = -1;
    Scanner scan = new Scanner(System.in);
    File file = new File("employee.txt");
    ArrayList<Employee> al = new ArrayList<Employee>();
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    ListIterator li = null;
    if (file.isFile()) {
      ois = new ObjectInputStream(new FileInputStream(file));
      al = (ArrayList<Employee>) ois.readObject();
      ois.close();
    }
    do {
      System.out.println("[1]. Insert data");
      System.out.println("[2]. Display data");
      System.out.println("[3]. Search data");
      System.out.println("[4]. Delete data");
      System.out.println("[5]. Update data");
      System.out.println("[6]. Exit");
      System.out.println("Enter your choice : ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter how many employees you want : ");
          int n = scan.nextInt();
          for (int i = 0; i < n; i++) {
            System.out.println("Enter employee id : ");
            int empno = scan.nextInt();

            System.out.println("Enter employee name : ");
            String ename = scan.next();

            System.out.println("Enter employee salary : ");
            int salary = scan.nextInt();
            al.add(new Employee(empno, ename, salary));
          }
          oos = new ObjectOutputStream(new FileOutputStream(file));
          oos.writeObject(al);
          oos.close();
          break;
        // ===========================================================================================
        case 2:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();

            System.out.println("================================================");
            li = al.listIterator();
            while (li.hasNext())
              System.out.println(li.next());
            System.out.println("================================================");
          } else {
            System.out.println("--------------------------------------------------------");
          }
          break;
        // ===========================================================================================
        case 3:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();
            boolean found = false;
            System.out.println("Enter empno to search : ");
            int empno = scan.nextInt();
            System.out.println("================================================");
            li = al.listIterator();
            while (li.hasNext()) {
              Employee e = (Employee) li.next();
              if (e.empno == empno) {
                System.out.println(e);
                found = true;
              }
            }
            if (!found)
              System.out.println("Record not found...!");
            System.out.println("--------------------------------------------------");
          } else {
            System.out.println("File does not exist.");
          }
          break;
        // ===========================================================================================
        case 4:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();
            boolean found = false;
            System.out.println("Enter empno to Delete : ");
            int empno = scan.nextInt();
            System.out.println("================================================");
            li = al.listIterator();
            while (li.hasNext()) {
              Employee e = (Employee) li.next();
              if (e.empno == empno) {
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
          } else {
            System.out.println("File does not exist.");
          }
          break;
        // ===========================================================================================
        case 5:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();
            boolean found = false;
            System.out.println("Enter empno to update : ");
            int empno = scan.nextInt();
            System.out.println("================================================");
            li = al.listIterator();
            while (li.hasNext()) {
              Employee e = (Employee) li.next();
              if (e.empno == empno) {
                System.out.println("Enter new employee name : ");
                String ename = scan.next();
                System.out.println("Enter new salary : ");
                int salary = scan.nextInt();
                li.set(new Employee(empno, ename, salary));
                found = true;
              }
            }
            if (found) {
              oos = new ObjectOutputStream(new FileOutputStream(file));
              oos.writeObject(al);
              oos.close();
              System.out.println("Record update successfully...!");
            } else {
              System.out.println("Record deleted successful");
            }
            System.out.println("--------------------------------------------------");
          } else {
            System.out.println("File does not exist.");
          }
          break;
      }
    } while (choice != 0);
  }
}
