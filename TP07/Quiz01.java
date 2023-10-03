public class Quiz01 {
  public static void f(int[] a, int m) {
    double[] b = f(a, 6.0);
    a[0] = a[0] * m;
    a[2] = (int) (b[0] + b[1]);
    m = m + 5;
  }

  public static double[] f(int a[], double x) {
    double b[] = new double[2];
    b[0] = a[0] + x;
    b[1] = a[1] + x;
    return b;
  }

  public static void main(String[] args) {
    int a[] = { 2, 3, 4 };
    int k = 5;
    f(a, k);
    System.out.println("k = " + k);
    System.out.println("a[0] = " + a[0]);
    System.out.println("a[1] = " + a[1]);
    System.out.println("a[2] = " + a[2]);
  }
}
// Output:
// k = 5
// a[0] = 10
// a[1] = 3
// a[2] = 17
