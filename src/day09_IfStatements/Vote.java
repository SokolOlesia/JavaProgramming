package day09_IfStatements;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scan.nextInt();

        String eligible;

        boolean eligibleToVote = age >= 18;

        if (eligibleToVote) {
            eligible = "Yes, you are eligible to vote, because your age is: " + age + ".";
        } else {
            eligible = "No, you aren't eligible to vote, because your age is: " + age + ", being less than 18.";
        }
        System.out.println(eligible);

    }


}

/*
Write a program that can check if the person is eligible to vote
 */