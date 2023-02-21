package week12_Abstraction.ShapeTask;

import static java.lang.Math.pow;
// power function - allows for squaring, cubing, etc.

public class Cube extends Shape implements Volume {

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calc_area() {
        return 6 * pow(side, 2);
    }

    @Override
    public double calc_perimeter() {
        return 12 * side;
    }

    @Override
    public double calc_volume() {
        return pow(side, 3);
    }
}
