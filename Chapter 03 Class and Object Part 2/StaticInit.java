public class StaticInit {
  private static double xs = 10 * Math.random();
  private static double ys;
  static {
    int n = (int) xs;
    ys = 0;
    for (int i = 0; i < n; i++)
      ys = ys + Math.random();
  }
  private static double zs = xs + ys;

  public static void main(String[] args) {
    System.out.println("xs:" + xs); // xs:7.910922227221599
    System.out.println("ys:" + ys); // ys:4.299239924517614
    System.out.println("zs:" + zs); // zs:12.210162151739212
  }
}
