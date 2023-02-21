package week09_ConstructorsStatics;

import java.time.LocalDate;

public class Tester {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public String employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name) {
        this.name = name;
    }

    public Tester(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Tester(String name, char gender, LocalDate dateOfBirth) {
        this(name, gender); // chaining to previous Constructor
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }



    public Tester(String name, char gender, LocalDate dateOfBirth, String employeeID, String jobTitle,
                  double salary){

        this(name);
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*public static void Tester(){
        System.out.println("Regular Method");
    }

    public static void main(String[] args) {

        new Tester();

    }*/

    public void smokeTesting(){
        System.out.println(jobTitle + " " + name + " is smoke testing");
    }

    public void creatingTicket(String ticketNumber){
        System.out.println(jobTitle + " " + name + " is creating ticket " + ticketNumber);

    }

    public void dailyStandUp(){

    }


}
/*
1. create a class called Tester

            Attributes:
                name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

            Add a constructor that can set all the fields

            Actions:
               smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */