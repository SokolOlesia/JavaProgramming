package day14_String;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        boolean digit = word.charAt(0) >= 48 && word.charAt(0) <= 57; // from 0 to 9
        boolean lowerCase = word.charAt(0) >= 97 && word.charAt(0) <= 122; // from a to z
        boolean upperCase = word.charAt(0) >= 65 && word.charAt(0) <= 90; // from A to Z


        if (digit) {
            result = "first character is digit";
        } else if (lowerCase) {
            result = "first character is lowercase letter";
        } else if (upperCase) {
            result = "first character is uppercase letter";
        } else {
            result = "first character is special character";
        }
        System.out.println(result);
        }

    }




/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */