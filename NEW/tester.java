import UC.util.cartesianMath.geom2d.Polygon;
import UC.util.Point2d;

public class Main(){
  public static void main(String[] args){
    Point2d p1 = new Point2d(10, 0);
    Point2d p2 = new Point2d(10, 10);
    Point2d p3 = new Point2d(0, 10);
    Point2d p4 = new Point2d(0, 0);
    
    Polygon p = new Polygon(p1, p2, p3, p4);
    
    System.out.println(p.getArea()); // the result should be 100
    p.set(12, p1); // this should THROW an EXCEPTION called InvalidIndexException
  }
}
