package day15_ForLoops;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
//        boolean palindrome = true;
//
//        for (int i = 0; i < input.length() / 2; i++) {
//
//            palindrome = palindrome ? (input.toLowerCase().charAt(i) == input.toLowerCase().charAt((input.length() - 1) - i)) : false;
//        }
//        System.out.println("pa = " + palindrome);

        String reversed = "";

        for (int i = input.length()-1 ; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindrome = input.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}

/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */