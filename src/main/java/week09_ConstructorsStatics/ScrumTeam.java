package week09_ConstructorsStatics;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam { // HAS a relation with Tester and Developer
                        // ScrumTeam HAS a Developer
                        // ScrumTeam HAS a Tester

    public String PO, BA, SM;
    public ArrayList<Tester> testers; // for Testers team
    public ArrayList<Developer> developers; // for Dev team
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void addTester(Tester tester){ // adds 1 tester into the testers team
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){ // adds MULTIPLE testers into the testers team
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developer){
        this.developers.addAll(Arrays.asList(developer));
    }

    public void removeTester(String employeeID){
        this.testers.removeIf(p -> p.employeeID.equals(employeeID));
    }

    public void removeDeveloper(String employeeID){
        this.developers.removeIf(p -> p.employeeID.equals(employeeID));
    }

    public String toString() {
        return "ScrumTeam{" +
                "# of Testers='" + testers.size() + '\'' +
                "# of Developers='" + developers.size() + '\'' +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
3. create a class called ScrumTeam

Attributes:
      PO, BA, SM (for storing their names ONLY)
      testers, developers, daysOfSprint

Add a constructor that can set the PO, BA, SM and daysOfSprint

Actions:

    addTester(Tester tester): adds the given tester to the testers ArrayList

    addTesters(Tester[] testers): adds the given testers to the testers ArrayList

    addDeveloper(Developer developer): adds the given developer to the developers ArrayList

    addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

    removeTester(long employeeID): removes the given tester from the testers ArrayList

    removeDeveloper(long employeeID): removes the developer from the developers ArrayList

    toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint
 */