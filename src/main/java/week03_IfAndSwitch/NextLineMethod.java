package week03_IfAndSwitch;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // \n

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
            // reads whatever was left in scanner memory and THEN the input

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("age = " + age);

        input.nextLine(); // needed to CLEAR the Scanner

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);


        input.close();
    }
}
