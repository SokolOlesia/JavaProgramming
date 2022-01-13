package day07_Operatos;

import java.util.Scanner;

public class LeapYearScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenYear = scan.nextInt();
        if ((givenYear % 4) == 0) {
            System.out.println(givenYear + " is a leap year: true");
        } else {
            System.out.println(givenYear + " is a leap year: false");
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
*/