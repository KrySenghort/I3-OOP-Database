public class MainExecute {
  public static void main(String[] args) {
    // Box aBox = new Box(); // obj
    BoxV1 bBox = new BoxV1(5, 2, 7); // obj new creation.
    BoxV1 bBox1 = new BoxV1();
    bBox1.setW(10);
    bBox1.setH(3);
    bBox1.setD(5);
    // double distance = aBox.d = 12.22;
    // double width = aBox.w = 4.55;
    // double height = aBox.h = 45.66;
    // double V = distance * height * width;
    // System.out.println("your volume is : " + V);
    // System.out.println("your volume is : " + aBox.Volume(distance,
    // width,height));
    // System.out.println("your area is : " + aBox.Area());
    System.out.println("your volume is : " + bBox.Volume());
    System.out.println("your area is : " + bBox.Area());
    // your volume is : 150.0
    // your area is : 190.0
    System.out.println("your volume1 is : " + bBox1.Volume());
    System.out.println("your area1 is : " + bBox1.Area());

    System.out.println(bBox);
    System.out.println(bBox.toString());

  }

}
