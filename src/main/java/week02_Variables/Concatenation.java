package week02_Variables;

public class Concatenation {

    public static void main(String[] args) {

        String name = "Shay King",
                companyName = "Apple";
        int age = 25;
        double salary = 85000.5;

        System.out.println("Hello " + name);

        System.out.println(name + " is " + age + " years old");

        System.out.println(name + " works at " + companyName + " and makes $" + salary + " per year");
        System.out.println("-------------------------------------------------");

        name = "Kudret";
        age = 28;
        companyName = "Microsoft";
        salary = 100_000;

        System.out.println(name + " works at " + companyName + " and makes $" + salary + " per year");


    }
}
