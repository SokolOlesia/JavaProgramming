package day09_IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharacterIdentit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char charat1 = scan.next().charAt(0);

        if((charat1 >= 65 && charat1 <= 90 ) || (charat1 >= 97 && charat1 <= 122)) {
            System.out.println("Alphabetic Character");
        } else if (charat1 >= 48 && charat1 <= 57 ){
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
/*
4. Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */