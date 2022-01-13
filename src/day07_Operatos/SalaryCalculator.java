package day07_Operatos;


import java.util.Scanner;


public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Your hourly rate: ");
        int hourlyRate = scan.nextInt();
        System.out.println("Your weekly hours: ");
        int weeklyHours = scan.nextInt();
        System.out.println("Your state tax: ");
        double stateTaxRate = scan.nextDouble();
        double federalTaxRate = 2.6;


        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * (stateTaxRate/100);
        double federalTax = salaryBeforeTax * (federalTaxRate/100);
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nFederal tax is: $" + federalTax + "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax + "\nNet income is: $" + salaryAfterTax);

    }
}
/*
double hourlyRate = 50;
        double weeklyHours= 45;
        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax =  salaryBeforeTax * 0.06;
        double federalTaxes = salaryBeforeTax * 0.26;
        double totalTax = stateTax + federalTaxes;
        double netIncome = salaryBeforeTax - totalTax;

Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */