package week11_Inheritance_MethodOverriding;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String employeeID,
                  String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void smokeTesting(){
        System.out.println(getJobTitle() + " " + getName() + " is smoke testing");
    }
}
/*
 4. Create the following subclasses of Employee and override the work method:

            4.1 Tester:
                    additional methods:
                        smokeTesting()

            4.2 Developer:
                    additional methods:
                        unitTesting()

        4.3 Teacher

        4.4 Janitor
 */