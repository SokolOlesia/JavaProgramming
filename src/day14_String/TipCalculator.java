package day14_String;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = scan.next().toLowerCase();


        double percent = 0;
        if (serviceQuality.equals("poor")) {
            percent = 0.05;
        } else if (serviceQuality.equals("fair")) {
            percent = 0.1;
        } else if (serviceQuality.equals("good")) {
            percent = 0.15;
        } else if (serviceQuality.equals("great")) {
            percent = 0.2;
        } else if (serviceQuality.equals("excellent")) {
            percent = 0.25;
        }

        double totalTip = Math.ceil(checkAmount * percent);

        double totalPerPerson = Math.ceil(checkAmount / numberOfPeople);

        double totalTipPerPerson = Math.ceil(totalTip / numberOfPeople);

        String totalForNo = "Number of people entered: " + numberOfPeople +
                "\nTotal to pay: " + checkAmount +
                "\nTotal tip: " + totalTip;

        String totalForYes = totalForNo +
                "\nTotal per person: " + totalPerPerson +
                "\nTip per person: " + totalTipPerPerson;

        boolean SplitYes = split.equals("yes");
        boolean SplitNo = split.equals("no");

        String result = "";

        if (SplitNo) result = totalForNo;
        else if (SplitYes) result = totalForYes;

        System.out.println(result);
        scan.close();
    }

}


/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.


    Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),
	Number of people entered: (number) (each person = & in output)
	Check amount: (number)
	Service Quality: (String)
	Total to pay:
	Total tip:
	Total per person:
	Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */