package day15_ForLoops;

import java.util.Scanner;

public class Retive {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        String digits = "";
        String letters = "";
        String specChar = "";



        for (int i = 0; i <= input.length() - 1; i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                digits += input.charAt(i);
            } else if ((input.charAt(i) >= 97 && input.charAt(i) <= 122) || (input.charAt(i) >= 65 && input.charAt(i) <= 90)) {
                letters += input.charAt(i);
            } else {
                specChar += input.charAt(i);
            }
        }
        System.out.println("digit = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specChar = " + specChar);

    }

}

/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */