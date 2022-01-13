package day31_Constructors.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Alex", 44, "SE", 13500);
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000);

        Tester[] testers = {tester1, tester3, tester4};

        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software developer", 135000);
        Developer developer4 = new Developer("Sinem", 13, "Senior Developer", 200000);

        Developer[] developers = {developer2, developer3, developer4};
        //1 Scrum team objects
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);
        System.out.println(scrum);

        scrum.addTester(tester2); //add tester
        scrum.addDeveloper(developer1);// add developer

        System.out.println(scrum);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);

        System.out.println("------------------------------------------------");
        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("------------------------------------------------");
        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("------------------------------------------------");
        scrum.removeTester(23);
        scrum.removeDeveloper(39);
        System.out.println(scrum);
    }
}

/*
	create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */