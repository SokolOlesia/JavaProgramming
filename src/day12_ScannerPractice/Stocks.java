package day12_ScannerPractice;

import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many?");
        int howMany = sc.nextInt(); // 100Enter

        boolean givesNumber = howMany <= 0;// (-5 - true)(10 - false)

        if(givesNumber){
            System.err.println("Error!");
        }else {
            System.out.println("Your total value: ");
            double totalValue = sc.nextDouble();

            sc.nextLine();

            System.out.println("Name of the company: ");
            String nameOfTheCompany = sc.nextLine();



            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of "+ howMany + " shares. " + nameOfTheCompany + " is your company holdings");

        }

    }
}

/*
StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */