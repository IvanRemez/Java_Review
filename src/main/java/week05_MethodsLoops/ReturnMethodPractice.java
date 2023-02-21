package week05_MethodsLoops;

public class ReturnMethodPractice {

    public static double calculate(double num1, char operator, double num2){

        double result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            default:
                System.err.println("Invalid Operator");
                System.exit(1); // terminates the whole program
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculate(200, '/', 0)); // result stays as 0

        System.out.println(calculate(30, '*', 90));

        System.out.println(calculate(20, '&', 20)); // invalid - program terminated

    }
}
/*
Tasks
    1. Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0
 */