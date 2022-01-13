package day09_IfStatements;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        String nameOfGroup = (age >= 0 && age <= 2) ? "Infant" :
                (age <= 5) ? "Toddler" :
                        (age <= 9) ? "Kid" :
                                (age <= 12) ? "Pre-teen" :
                                        (age <= 17) ? "Teenager" :
                                                (age <= 20) ? "Young Adult" :
                                                        (age <= 39) ? "Adult" :
                                                                (age <= 49) ? "Young Middle-Aged Adult" :
                                                                        (age <= 54) ? "Middle-Aged Adult" :
                                                                                (age <= 64) ? "Very Young Senior Citizen" :
                                                                                        (age <= 74) ? "Young Senior Citizen" :
                                                                                                (age <= 84) ? "Senior Citizen" :
                                                                                                        "Old Senior Citizen";

        System.out.println(nameOfGroup);
    }
}
/*
char grade = score >= 90 ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
 */
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */
