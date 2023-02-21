package week09_ConstructorsStatics;

import java.time.LocalDate;

public class Developer {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public String employeeID;
    public String jobTitle;
    public double salary;

    public static boolean hasProgrammingSkill = true;


    public Developer(String name, char gender, LocalDate dateOfBirth, String employeeID,
                     String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(jobTitle + " " + name + " is coding");
    }

    public void unitTesting(){
        System.out.println(jobTitle + " " + name + " is unit testing the project");
    }

    public void fixingBug(){
        System.out.println(jobTitle + " " + name + " is crying");
    }

}
/*
2. create a class called Developer

	        Attributes:
	        	name, gender, dateOfBirth, age, employeeID, JobTitle, Salary,
	        	hasProgrammingSkill

        	Add a constructor that can set all the fields

	        Actions:
	        	coding(), unitTesting(), fixingBug(), toString()
 */