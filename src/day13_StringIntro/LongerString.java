package day13_StringIntro;

import java.util.Scanner;

public class LongerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string:");
        String first = input.nextLine();

        System.out.println("Enter second string:");
        String second = input.nextLine();

        int firstLength = first.length();
        int secondLength = second.length();


        if(firstLength > secondLength) {
            System.out.println(first + " is the longest string");
        } else {
            System.out.println(second+ " is the longest string");
        }

        }

    }

/*
2. write a program that asks user to enter two strings, and print out the longest string
 */