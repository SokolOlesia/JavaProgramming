package day20_Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a length:");
        int length = scan.nextInt();
        int average = 0;
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        int sumOfAverage = average/ numbers.length;
        System.out.println(sumOfAverage);
    }
}
