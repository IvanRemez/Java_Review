package week03_IfAndSwitch;

import java.util.Scanner;

public class NextLineMethod2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        input.nextLine(); // Needed to CLEAR the Scanner

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("name = " + name);

        input.close();

    }
}
