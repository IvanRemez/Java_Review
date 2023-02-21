package week11_Inheritance_MethodOverriding;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeID,
                     String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    public void unitTesting(){
        System.out.println(getName() + " is unit testing");
    }
}
