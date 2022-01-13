package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester) {
        testersList.add(tester); // add one tester to Array List of testers
    }

    public void addTesters(Tester[] testers) {
        testersList.addAll(Arrays.asList(testers)); //adds the given testers to the testers ArrayList
    }

    public void addDeveloper(Developer developer) {
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers) {
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(long employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(long employeeID) {
        devopsList.removeIf(p -> p.employeeID == employeeID);
    }


    public String toString() {
        return "ScrumTeam: " + "\n" +
                "PO = " + PO + "\n" +
                "BA = " + BA + "\n" +
                "SM = " + SM + "\n" +
                "Total number of testers = " + testersList.size() + "\n" +
                "Total number of developers = " + devopsList.size() + "\n" +
                "Days of sprint = " + daysOfSprint + "\n";
    }
}

/*
Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */