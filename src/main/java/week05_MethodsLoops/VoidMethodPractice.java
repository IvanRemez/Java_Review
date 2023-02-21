package week05_MethodsLoops;

public class VoidMethodPractice {

    // This method takes 3 arguments (2 double and 1 char) and calculates
    public static void calculate(double num1, char operator, double num2){

        if (num1 < 0 || num2 < 0){ // if there is a negative number
            System.out.println("Both " + num1 + " and " + num2 + " need to be positive");
            return; // exits the method
        }

        switch (operator){
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                }else {
                    System.out.println(num1 + " cannot be divided by zero");
                }
                break;

            default:
                System.out.println("0");
        }
    }

    public static void main(String[] args) {

        calculate(10.5, '+', 5.5);

        calculate(20, '/', 0);

        calculate(10, '/', 2);

        System.out.println("----------------------------------------");

        // double result = calculate(100, '+', 200);
        // needs to be a return method to be able to assign to a new variable (object)

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