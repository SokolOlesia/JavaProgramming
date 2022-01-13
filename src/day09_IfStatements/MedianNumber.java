package day09_IfStatements;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a number is:");
        int a = sc.nextInt();
        System.out.println("b number is:");
        int b = sc.nextInt();
        System.out.println("c number is:");
        int c = sc.nextInt();
        //              a = 15, b = 10, c = 20     a = 15, c = 10, b = 20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b < c && b > a) || (b < a && b > c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        // boolean cIsMedian = (c < b && c > a) || (c < a && c > b);

        if(aIsMedian){
            System.out.println(a + " is the median number");
        }else if(bIsMedian){
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */