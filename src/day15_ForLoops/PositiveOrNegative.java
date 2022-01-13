package day15_ForLoops;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int negative = 0;
        int positive = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num < 0) {
                negative++;
            } else if (num > 0) {
                positive++;
            }

        }
        System.out.println(positive + " positive and " + negative + " negative");
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */