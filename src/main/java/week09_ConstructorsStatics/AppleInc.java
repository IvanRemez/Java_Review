package week09_ConstructorsStatics;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppleInc {

    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("Sajjad",'M', LocalDate.of(1998,3,4),"A01","QA",100000),
                new Tester("Sajjad",'M', LocalDate.of(1998,3,4),"A01","QA",100000),
                new Tester("Sajjad",'M', LocalDate.of(1998,3,4),"A01","QA",100000),
        };

        Developer[] developers = {
                new Developer("Jamal", 'M', LocalDate.of(1977, 11, 14), "1234", "Java Developer", 150000),
        new Developer("Halima", 'F', LocalDate.of(1997, 12, 4), "1224", "Swift Developer", 150000),
        new Developer("Najat", 'F', LocalDate.of(1970, 1, 24), "1536", "JavaScript Developer", 150000),
        new Developer("Ahmad", 'M', LocalDate.of(1988, 3, 21), "1137", "backEnd Developer", 150000),
        new Developer("Youssef", 'M', LocalDate.of(1999, 4, 22), "1438", "FrontEnd Developer", 150000),
        new Developer("Marwa", 'F', LocalDate.of(1995, 7, 5), "1239", "Data Developer", 150000),
        new Developer("Kamal", 'M', LocalDate.of(2001, 6, 15), "1240", "API Developer", 150000),
        };

        Developer dev2 = new Developer("Halima",'F',LocalDate.of(1997,12,4), "1224", "Swift Developer",100000);

        ScrumTeam scrum1 = new ScrumTeam("Nazar","Olzhas","Kudret",
                14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        scrum1.addDeveloper(dev2);

        System.out.println(scrum1);

        scrum1.removeDeveloper("9563");
        System.out.println(scrum1);

        scrum1.removeTester("A02");
        System.out.println(scrum1);
        System.out.println("-----------------------------------------------");

        for (Tester eachTester : scrum1.testers) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("-----------------------------------------------");

        for (Developer eachDeveloper : scrum1.developers) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("-----------------------------------------------");

        // HOMEWORK:

        ScrumTeam scrum2;

        ScrumTeam scrum3;

        System.out.println("-----------------------------------------------");

        // Create collection to store all 3 scrum teams:

        ArrayList<ScrumTeam> scrums = new ArrayList<>();
        // OR
        // ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};
    }
}
/*
4.create a class called AppleInc:

1. create an array of Testers and add the testers from your group
2. create an array of developers add the developers from your group
3. create an object of ScrumTeam named scrum1 and store the testers & developers above to the scrum team
4. Display the full infos of the scrum team
5. Create another object of ScrumTeam named scrum2 and store 2 testers & 5 develoeprs objects
6. Create an array of ScrumTeam and store all the scrum objects (scrum1 & scrum2)
 */