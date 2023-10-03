import java.util.Scanner;

public class Ex01 {
  int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  String max(String a, String b) {
    if (a.compareTo(b) > 0) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Ex01 m = new Ex01();
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter string1 : ");
    String x = scan.next();
    System.out.println("Enter string2 : ");
    String y = scan.next();
    System.out.println("The max string is " + m.max(x, y));

    System.out.println("Enter num1 : ");
    int a = scan.nextInt();
    System.out.println("Enter num2 : ");
    int b = scan.nextInt();
    System.out.println("The max number is " + m.max(a, b));

  }
}
