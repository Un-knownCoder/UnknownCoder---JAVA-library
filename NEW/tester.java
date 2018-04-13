import UC.util.cartesianMath.geom3d.*; // (Pyramid and Prism)
import UC.util.cartesianMath.geom2d.Polygon;
import UC.util.Point2d;

public class Main(){
  public static void main(String[] args){
    Point2d A = new Point2d(10, 0);
    Point2d B = new Point2d(10, 10);
    Point2d C = new Point2d(0, 20);
    
    Polygon p = new Polygon(A, B, C);
    
    Prism pr = new Prism(p, 10);
    System.out.println(pr.getVolume());
  }
}
