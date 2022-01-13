package day12_ScannerPractice;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();

       String less3peopleStr = "Live with less than 3 people";
       String threeOrSixPeopleStr = "Live with 3 - 6 people";
       String moreSixPeopleStr = "Live with more than 6 people";

        boolean less3people = numberOfPeople < 3;
        boolean threeOrSixPeople = (numberOfPeople >= 3) && (numberOfPeople <= 6);
        boolean moreSixPeople = numberOfPeople < 3;

        String result = (less3people)? less3peopleStr : (threeOrSixPeople) ? threeOrSixPeopleStr : (moreSixPeople) ? moreSixPeopleStr : "Invalid";

        System.out.println(result);


    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */