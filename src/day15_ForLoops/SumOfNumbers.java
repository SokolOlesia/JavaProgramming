package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i; // 1+2+3+4....
        }
        System.out.println(sum);

        System.out.println("----------------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

// total of 5 numbers
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
            total += scan.nextInt(); // total = total + scanner number
        }
        System.out.println("total = " + total);
scan.close();


    }
}
