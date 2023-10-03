public class TestPoint {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();//create object p1
        p1.x = 5;
        p1.y = 8;
        p1.z = 9;
        p1.show();
        System.out.printf("Point (x:%d, y:%d)\n",p1.x,p1.y);
    }
}
