package day09_IfStatements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = scan.nextInt();

        String info1 = "grade - 1\n" +
                "        location -  Apple orchard\n" +
                "        number of groups - 3\n" +
                "        teacher in charge - Ms. Smith";
        String info2 = "grade - 2\n" +
                "        location - Zoo\n" +
                "        number of groups - 7\n" +
                "        teacher in charge - Mr. Lee";
        String info3 = "grade - 3\n" +
                "        location - Aquarium\n" +
                "        number of groups - 5\n" +
                "        teacher in charge - Ms. Wilson";
        String info4 = "grade - 4\n" +
                "        location - Movie theater\n" +
                "        number of groups - 2\n" +
                "        teacher in charge - Ms. Reyes";
        String info5 = "grade - 5\n" +
                "        location - Museum\n" +
                "        number of groups - 5\n" +
                "        teacher in charge - Ms. Lela";
        String info6 = "grade - 6\n" +
                "        location - Six Flags\n" +
                "        number of groups - 8\n" +
                "        teacher in charge - Mr. Watt";
        String errorInfo = "Trip is not available to you!";


        String detailsOfTrip = (grade == 1) ? info1 :
                (grade == 2) ? info2 :
                        (grade == 3) ? info3 :
                                (grade == 4)? info4 :
                                        (grade == 5)? info5:
                                                (grade == 6)? info6: errorInfo;
        System.out.println("Info about your trip: " + detailsOfTrip);
    }
}
/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade.
Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */