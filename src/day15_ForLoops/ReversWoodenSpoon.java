package day15_ForLoops;

import java.util.Scanner;

public class ReversWoodenSpoon {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String result = "";
        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }
        System.out.println("result = " + result);
    }
}

/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */