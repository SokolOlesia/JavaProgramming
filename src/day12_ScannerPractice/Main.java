package day12_ScannerPractice;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Enter your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");

        String name1 = scan.next();
        double value1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");

        String name2 = scan.next();
        double value2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");

        String name3 = scan.next();
        double value3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");

        String name4 = scan.next();
        double value4 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");

        String name5 = scan.next();
        double value5 = scan.nextDouble();


        double average = (value1 + value2 + value3 + value4 + value5)/5;

        String result = "Summary: " + name1 + " - " + value1 + ",  " + name2 + " - " + value2 + ",  " + name3 + " - " + value3 + ", " + name4 + " - " + value4 + ", " + name5 + " - " + value5 + "\nYour average score is: " + average + "\nThank you for using Grader!\nGoodbye!";

        System.out.println(result);
    }
}
