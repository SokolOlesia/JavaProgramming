package day09_IfStatements;



import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number:");
        byte num = number.nextByte();

        String nameOfNumber;
        if (num == 1) {
            nameOfNumber = "One";
        } else if (num == 2) {
            nameOfNumber = "Two";
        } else if (num == 3) {
            nameOfNumber = "Three";
        } else if (num == 4) {
            nameOfNumber = "Four";
        } else if (num == 5) {
            nameOfNumber = "Five";
        } else if (num == 6) {
            nameOfNumber = "Six";
        } else if (num == 7) {
            nameOfNumber = "Seven";
        } else if (num == 8) {
            nameOfNumber = "Eight";
        } else {
            nameOfNumber = "Nine";
        }
        System.out.println(nameOfNumber);
    }
}

/*
 Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */