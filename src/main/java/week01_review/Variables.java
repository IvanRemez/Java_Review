package week01_review;

public class Variables {

    public static void main(String[] args) {

        // DataType variableName = Data

        String name = "Daniel";

        int score = 85;
        double gpa = 3.5;
        // char grade = '35000';
        char grade = 'A';
        boolean passed = true,
                full_time = true;

        System.out.println("name = " + name);
        System.out.println("score = " + score);
        System.out.println("grade = " + grade);
        System.out.println("gpa = " + gpa);
        System.out.println("passed = " + passed);
        System.out.println("full_time = " + full_time);
        System.out.println("----------------------------------");
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("----------------------------------");

        // 26.5%, 5.5%, 1956, D, Cydeo School

        double federal_tax = 26.5,
                state_tax = 5.5;
        int year = 1956;
        char license = 'D';
        String school = "Cydeo School";

        System.out.println("federal_tax = " + federal_tax);
        System.out.println("state_tax = " + state_tax);
        System.out.println("year = " + year);
        System.out.println("license = " + license);
        System.out.println("school = " + school);

    }
}

/*
primitives:
    int - for integers
    double - decimals
    char - single character
    boolean - true/false

Non-primitives:
    String - text
 */