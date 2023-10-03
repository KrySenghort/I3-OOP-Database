package Lesson02;
public class Point {
    public double x;
    private double y;
    private void show(){
        System.out.println("x="+x+", y="+y);
    }
    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }
    protected double distance(){
        return Math.sqrt(x*x + Math.pow(y,2));
    }
    static void DoChange(Point p){
        p.x += 9;
        p.y += 9;
    }
    void CoverChange(){
        DoChange(this);
    }
    public boolean closerToOriginThan(Point p2){
        if(distance() < p2.distance()) return true;
        else return false;
    }
    void foo(int x, Point p){
        p.translate(10, 10);
        x += 10;
        p = new Point();
        p.translate(10, 10);
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        int x = 10;
        p1.x = 2;
        p1.y = 3;
        p1.show();
        p1.foo(x, p1);
        p1.show();
        System.out.println("x = "+x);
        p1.CoverChange();
        Point p2 = new Point();
        p2.CoverChange();
        /*Point p2 = new Point();
        p1.x = 4;
        p1.y = 5;
        DoChange(p1);
        p1.show();
        System.out.println(p1.distance());//distance from 0,0
        p2.x = 7;
        p2.y = 99;
        p2.show();
        
        Point p3 = null;
        if(p3==null) System.out.println("P3 is null.");*/
    }
}