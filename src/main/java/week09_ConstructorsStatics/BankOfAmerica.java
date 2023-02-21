package week09_ConstructorsStatics;

import java.time.LocalDate;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester t1 = new Tester("Josh",'M', LocalDate.of(1985,4,5),
                "A01","QA",100000);
        System.out.println(t1);

        Tester t2 = new Tester("Ali");
        System.out.println(t2);

        Tester t3 = new Tester("Saja",'F');
        System.out.println(t3);

        Tester t4 = new Tester("Yana",'F', LocalDate.of(1999,5,24));
        System.out.println(t4);
        System.out.println("-----------------------------------------------------------");


        Developer dev1 = new Developer("Aaron",'M',LocalDate.of(1991,2,15),
                "B35","Java Developer", 100000);

        System.out.println(dev1);

        //dev1.smokeTesting(); // method doesn't exist
        t1.smokeTesting();

        //t3.coding(); // no method
        t3.creatingTicket("smoke123");
        //dev1.creatingTicker("smoke123");

        dev1.coding();
        dev1.fixingBug();
        dev1.unitTesting();


    }

}
