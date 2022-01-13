package day22_MultiDimensionArray;

import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); // 8

        int num1 = 0;
        int num2 = 1;
        int result = 0;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 2; i < count; i++) { // 6
            result = num1 + num2;  // result = 0 + 1 = 1 // result =  1 (num1) + 1(num2) = 2 // result = 1(num1) + 2(num2) = 3
            System.out.print(result + " ");  //1 //2 // 3
            num1 = num2; // num1 = 1 // num1 = 1 // num1 = 2 // num1 = 3
            num2 = result; // num2 = 1 // num2 = 2 // num2 = 3 // num2 = 5

        }
    }
}
// 0 1 1 2 3 5