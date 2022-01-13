package day15_ForLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        System.out.println(fact);
    }
}

/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */