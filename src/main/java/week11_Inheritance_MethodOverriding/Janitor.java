package week11_Inheritance_MethodOverriding;

public class Janitor extends Employee{

    public Janitor(String name, int age, char gender, String employeeID,
                   double salary) {
        super(name, age, gender, employeeID, "Janitor", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is cleaning");
    }
}
