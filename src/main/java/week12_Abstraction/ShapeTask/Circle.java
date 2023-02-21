package week12_Abstraction.ShapeTask;

import static java.lang.Math.PI; // pi - 3.14
import static java.lang.Math.pow;
    // power function - allows for squaring, cubing, etc.

public class Circle extends Shape{

    private double radius;

    // imported above ^^
    // public final static double pi = Math.PI;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calc_area() {
        return pow(radius, 2) * PI;
    }

    @Override
    public double calc_perimeter() {
        return radius * 2 * PI;
    }
}
