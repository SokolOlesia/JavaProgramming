package day12_ScannerPractice;

import java.util.Scanner;

public class ConvertCents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int enterCents = input.nextInt();

        int dollars = enterCents/100;
        int cents = enterCents%100;

        String result = enterCents + " cents equal to: " + dollars + " dollars and " + cents + " cents";

        System.out.println(result);
    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */