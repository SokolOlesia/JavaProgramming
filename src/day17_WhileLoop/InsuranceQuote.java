package day17_WhileLoop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your gender: (Female/Male/Non-binary)");
        String gender = scan.next();

        while (!(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("non-binary"))) {
            System.err.println("Gender is invalid.\nEnter your gender: (Female/Male/Non-binary)");
            gender = scan.next();
        }


        System.out.println("Are you married? (Yes/No)");
        String isMarried = scan.next();

        while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))) {
            System.err.println("Invalid input.\nAre you married? (Yes/No)");
            isMarried = scan.next();
        }

        System.out.println("Enter your age ");
        int age = scan.nextInt();

        while (!(age >= 0 && age <= 120)) {
            System.err.println("Invalid input.\nEnter your age:");
            age = scan.nextInt();
        }

        System.out.println("How many miles you drive in a day: ");
        int milesPerDay = scan.nextInt();
        while(!(milesPerDay >= 5)){
            System.err.println("Invalid input.\nHow many miles you drive in a day: ");
            milesPerDay = scan.nextInt();
        }

        System.out.println("Did you have any accidents or claims in past 5 years (Yes/No)");
        String accidents = scan.next();
        while (!(accidents.equalsIgnoreCase("yes") || accidents.equalsIgnoreCase("no"))) {
            System.err.println("Invalid input.\nDid you have any accidents or claims in past 5 years (Yes/No)");
            accidents = scan.next();
        }

        System.out.println("Is your car equipped an anti-theft device? (Yes/No)");
        String device = scan.next();
        while (!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))) {
            System.err.println("Invalid input.\nIs your car equipped an anti-theft device? (Yes/No)");
            device = scan.next();
        }


    }
}

/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount



 */