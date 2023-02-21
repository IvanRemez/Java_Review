package week02_Variables;

public class PrimitiveCastings {

    public static void main(String[] args) {

        /*
        byte < short < int < long < float < double

        IMPLICIT = smaller to larger primitive type
        done automatically
        */

        byte a = 50;
        long b = a; // implicit

        double c = 100; // will be 100.0

        /*
        EXPLICIT = larger to smaller primitive type
        must be done MANUALLY

        */

        double x = 10.5;
        int y = (int)x;

        long z = 1000;
        short q = (short) z;
    }
}
