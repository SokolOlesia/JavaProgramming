package day17_WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0; // мы создали переменную для хранения данных и использования ее в дальнейшем
        int num = 0;

        while (true) { // infinity loop - что б спрашивал бесконечно
            System.out.println("Number:");
            num = scan.nextInt(); // запиши его в память // 5 // 7 // -7
//          int num = 7;
            if (num >= 0) { // true
                result += num; // result = result + num; result = 5 + 7; result = 12;
                System.out.println("result = " + result); // result = 5 // result = 12
            } else{
                break; //выходит из всех циклов в которых он содержится
            }
            System.out.println("We are in while");
        }
        System.out.println("Break");
    }
}

/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */