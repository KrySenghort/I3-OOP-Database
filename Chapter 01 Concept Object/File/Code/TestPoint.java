public class TestPoint {
  public static void main(String[] args) {
    Point p1 = new Point();
    Point3D p2 = new Point3D();
    p1.x = -9;
    p1.y = 4;
    p2.z = 2;
    int a = p2.ID;
    String b = p2.name;
    String c = p2.position;
    float d = (float) p2.salary;
    System.out.printf("Point(x:%d,y:%d,z:%d)\n", p1.x, p1.y, p2.z);
    System.out.printf("Name : %s\nID : %d\nPosition : %s\nSalary : %f", b, a, c, d);
    System.out.printf("Name : %s\nID : %d\nPosition : %s\nSalary : %f", p2.name, p2.ID, p2.position, p2.salary);
  }
}
