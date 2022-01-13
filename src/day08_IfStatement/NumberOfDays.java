package day08_IfStatement;

import java.util.*;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of month: ");
        int number = sc.nextInt();


        boolean day30 = number == 4 || number == 6 || number == 9 || number == 11;//if the month has 30 days
        boolean day28 = number == 2; //if the month has 28 days
        boolean day31 = !day28 && !day30; //if the month has 31 days

        if (day31) {
            System.out.println("31 Days");
        } else if (day30) {
            System.out.println("30 Days");
        } else if (day28) {
            System.out.println("28 Days");
        }

    }
}
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */