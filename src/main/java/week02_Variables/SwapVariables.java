package week02_Variables;

public class SwapVariables {

    public static void main(String[] args) {

        // with a temporary variable

        int x = 100;
        int y = 200;
        int z = x; // z = 100, used for containing the ORIGINAL value of x

        x = y; // x = 200, x will have the value of y,
                // x will no longer have the ORIGINAL value
        y = z; // y will have z's value which is the ORIGINAL value of x

        System.out.println("x = " + x); // 200
        System.out.println("y = " + y); // 100
        System.out.println("-------------------------------------");

        // without temporary variable

        int a = 10;
        int b = 20;

        a = a + b; // a = 30
                // a is now equal to the sum of original values of a & b
        b = a - b; // b = 10 (original value of a)
                // subtract sum of original a & b from new a to get original a value
        a = a - b; // a = 30 - 10 = 20 (original value of b)

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
