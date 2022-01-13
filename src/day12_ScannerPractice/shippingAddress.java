package day12_ScannerPractice;

import java.util.Scanner;

public class shippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your zip: ");
        String zipCode = input.next();

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + zipCode);

        input.close();
    }
}
