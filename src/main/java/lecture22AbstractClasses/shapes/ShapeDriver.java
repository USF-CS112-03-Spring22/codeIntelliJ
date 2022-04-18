package lecture22AbstractClasses.shapes;
import java.util.*;

/** This shows an alternative to the previous lab that used Area interface to compute the area. Here we use an abstract class Shape. */
public class ShapeDriver {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        //Uncomment once you complete classes Circle and Rectangle
        //shapes.add(new Circle(1.0));
        //shapes.add(new Rectangle()(2.0, 1.0));
        for (Shape s: shapes) {
            System.out.println(s.computeArea());
        }

    }
}
