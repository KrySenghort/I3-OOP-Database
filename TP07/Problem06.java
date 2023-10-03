import java.util.Arrays;

public class Problem06 {
  // Write a java program to check if two array is equal or not.
  public static void verify(int a[], int b[]) {
    boolean result = Arrays.equals(a, b);
    if (result == true) {
      System.out.println("Two arrays are equal");
    } else {
      System.out.println("Two arrays are not equal");
    }
  }

  public static void verify2(String a[], String b[]) {
    boolean result = Arrays.equals(a, b);
    if (result == true) {
      System.out.println("Two arrays are equal");
    } else {
      System.out.println("Two arrays are not equal");
    }
  }

  public static void main(String[] args) {
    int a[] = { 30, 25, 40, 45, 8, 90 };
    int b[] = { 30, 25, 40, 45, 8, 90 };
    System.out.println("==========================");
    System.out.println("First two arrays : ");
    verify(a, b);
    System.out.println("==========================");
    int c[] = { 34, 45, 6, 78, 45, 3, 54, 67 };
    int d[] = { 1, 2, 4, 5, 6, 7, 8 };
    System.out.println("Second two arrays : ");
    verify(c, d);
    System.out.println("==========================");
    String e[] = { "C#", "C++", "C", "Java", "HTML", "SQL", "Python", "R" };
    String f[] = { "C++", "C#", "C", "Java", "SQL", "HTML", "Python", "R" };
    System.out.println("Third two arrays : ");
    verify2(e, f);
    System.out.println("==========================");

  }
}
