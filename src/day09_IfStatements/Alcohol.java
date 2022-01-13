package day09_IfStatements;

import java.util.Scanner;

public class Alcohol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scan.nextInt();

        String eligible;

        boolean eligibleToBuy = age >= 21;

        if (eligibleToBuy) {
            eligible = "Yes, you are eligible to buy alcohol, because your age is: " + age + ".";
        } else {
            eligible = "No, you aren't eligible to buy alcohol, because your age is: " + age + ", being less than 21.";
        }
        System.out.println(eligible);

    }
}
/*
Write a program that can check if the person is eligible to buy alcohol
 */
