public class Overloading1 {
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
    String s1 = "Melbourne";
    String s2 = "Sydney";
    String s3 = "Adelaide";
    int a = 10;
    int b = 20;
    Overloading1 c = new Overloading1();
    System.out.println(c.max(s1, s2));
    System.out.println(c.max(s2, s3));
    System.out.println(c.max(s1, s3));
    System.out.println(c.max(a, b));

  }
}
