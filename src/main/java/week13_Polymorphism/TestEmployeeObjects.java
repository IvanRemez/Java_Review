package week13_Polymorphism;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee;

        employee = new Tester("Josh",35,'M',"A01","Manual Tester",100000);

        employee.work();
        // employee.smokeTesting; // Reference type decides what's accessible

        // Tester tester = (Tester) employee; // if need to reuse variable
        ((Tester)employee).smokeTesting(); // OR cast directly

        // ((Developer)employee).unitTesting();
            // ClassCastException - Developer and Tester do NOT have IS A relation

        // employee.setSalary(-20000); // RuntimeException

        System.out.println(employee);
        System.out.println("-------------------------------------------");

        employee =  new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000);

        employee.work();
        ((Developer)employee).unitTesting();
        // ((Tester)employee).smokeTesting(); // ClassCastException - no IS A relation with Tester

        System.out.println("-------------------------------------------");

        employee =  new Teacher("Jimmy", 36, 'M', "A03", 100000);

        employee.work();
        ((Teacher)employee).workFromHome();
            // OR
        ((RemoteJob)employee).workFromHome();
            // employee has IS A relation with both Teacher class and RemoteWork interface

        System.out.println("-------------------------------------------");

        employee =  new Driver("Aaron", 40, 'M', "B01", 110000, 'A');

        employee.work();
        System.out.println(employee);
        System.out.println("-------------------------------------------");

        employee = new Janitor("Daniel", 38, 'M', "C01", 90000);

        employee.work();
        System.out.println(employee);
        System.out.println("-------------------------------------------");

        Employee[] employees = {
                new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000),
                new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000),
                new Teacher("Jimmy", 36, 'M', "A03", 100000),
                new Driver("Aaron", 40, 'M', "B01", 110000, 'A'),
                new Janitor("Daniel", 38, 'M', "C01", 90000)
        };

        employees[0].work(); // 1st element - Tester

        int countTesters = 0;
        for (Employee each : employees) {

            each.work();    // executes work() of each employee

            if (each instanceof Tester){
                countTesters++;
            }
        }
        System.out.println(countTesters);

    }
}
