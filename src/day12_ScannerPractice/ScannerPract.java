package day12_ScannerPractice;

import java.util.Scanner;

public class ScannerPract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scan.nextDouble();
        System.out.println("Enter the width: ");
        int width = scan.nextInt();

        int area = (int) (length * width);
        int perimetr = (int) (length + width) * 2;

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimetr = " + perimetr);


    }
}
