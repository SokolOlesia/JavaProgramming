package day07_Operatos;

public class LeapYear {
    public static void main(String[] args) {
    int year = 2021;
    int leapYear = year%4;

        if(leapYear == 0 ){
            System.out.println(year + " is leap year: true");
        }
    }
}
/*
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenYear = sc.nextInt();
        if ((givenYear % 4) == 0) {
            System.out.println(givenYear + " is a leap year: true");}
        else {
            System.out.println(givenYear + " is a leap year: false");
        }
    }
}
reate a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year

 */