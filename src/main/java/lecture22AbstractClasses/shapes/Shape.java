package lecture22AbstractClasses.shapes;

// An abstract super class of classes Circle and Rectangle
public abstract class Shape {  // note that class is abstract
    public abstract double computeArea(); // note that the method is abstract

    @Override
    public String toString() { // non-abstract
        return this.getClass().getSimpleName() + ", Area: " + computeArea();
    }
}
