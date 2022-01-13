package day15_ForLoops;

import java.util.Scanner;

public class MaximumAndMinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE; //-2147483648
        int min = Integer.MAX_VALUE; // 2147483647
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();// 1,2,3 ,1 (false),

            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        scan.close();
    }
}
/*
Write a program that asks the user to enter
5 numbers and return max number
 */
/*int num;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            num = scan.nextInt();
            if(num>max) max=num;
        }
        System.out.println(max);*/