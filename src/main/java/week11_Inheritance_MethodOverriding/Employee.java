package week11_Inheritance_MethodOverriding;

public class Employee extends Person{

    private String employeeID, jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String employeeID,
                    String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {

        if (employeeID.startsWith("0")){
            System.err.println("Employee ID cannot start with the character '0'");
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle == null){
            System.err.println("Job title cannot be empty or null");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0){
            System.err.println("Invalid salary " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub-class of Person named Employee:

            Extra variables:
                employeeId (String), jobTitle, salary

            Encapsulate all the fields
                restrictions for the fields:
                    job title can not be empty
                    job title can not be null
                    salary can not be negative
                    salary can not be zero
                    employee id can not start with the character '0'

            Add a constructor to set all the fields
                (Make sure all the restrictions are applied)

            Methods:
                work()
                toString()
 */