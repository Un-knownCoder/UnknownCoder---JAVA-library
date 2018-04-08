import UC.util.cartesianMath.geom3d.*; // (Sphere and Segment3d)
import UC.util.Point3d;

public class Main(){
  public static void main(String[] args){
    Point3d A = new Point3d(10, 0);
    Point3d B = new Point3d(10, 10);
    
    Segment3d s = new Segment3d(A, B);
    Sphere sp = new Sphere(s);
    
    System.out.println(sp.getVolume());
  }
}
