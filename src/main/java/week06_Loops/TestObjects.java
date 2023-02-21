package week06_Loops;

import java.util.Scanner;

public class TestObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Josh", "Java", "Encapsulation", 25, 28, 'M', true, false);

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Emily", "Java", "Inheritance", 28, 24, 'F', false, false);

        CydeoStudent student3 = new CydeoStudent();
        student3.setInfo("Daniel", "Java", "Polymorphism", 45, 26, 'M', true, true);

        student1.name = "Sajjad"; // reassigns student1's name

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.study();

        CydeoStudent student4 = new CydeoStudent();
        System.out.println(student4);

        student4.study();

        System.out.println("-----------------------------------");

        CydeoStudent s1 = new CydeoStudent();
        s1.setInfo("Josh", "Java", "Encapsulation", 25, 28, 'M', true, false);

        CydeoStudent s2 = s1;

        System.out.println("-----------------------------------");

        int num = new Scanner(System.in).nextInt();

    }
}
