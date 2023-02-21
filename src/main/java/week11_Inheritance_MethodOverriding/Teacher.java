package week11_Inheritance_MethodOverriding;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String employeeID,
                   String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }


}
