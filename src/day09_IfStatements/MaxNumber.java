package day09_IfStatements;


import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();

        String max;

        boolean isFirstMax = num1 > num2;
        boolean isSecondMax = num2 > num1;

        if (isFirstMax) {
            max = "Number " + num1 + " is maximum number between " + num1 + " and " + num2 + ".";

        } else {
            max = "Number " + num2 + " is maximum number between " + num1 + " and " + num2 + ".";
        }
        System.out.println(max);

    }
}

/*
 1. Maximum number between two different numbers

 */