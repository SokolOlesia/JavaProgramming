package day12_ScannerPractice;

import java.util.Scanner;

public class MillesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = sc.nextDouble();

        double milesToKm = miles * 1.609;

        System.out.println( miles + " miles equal to " + milesToKm + " kilometers");
    }
}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */