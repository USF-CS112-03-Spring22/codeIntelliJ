package lecture22AbstractClasses.shapes;

public abstract class Shape {
    public abstract double computeArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Area: " + computeArea();
    }
}
