package childs;
import parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {}

    public Triangle(double base, double height, String color) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    // override dan implementasi method abstract getArea
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}