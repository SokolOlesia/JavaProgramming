package day12_ScannerPractice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("speedLimit = " + speedLimit + "\nEnter current speed:");
        int currentSpeed = scan.nextInt();
        int overSpeed = currentSpeed - speedLimit;


        String output = (currentSpeed > 55)? "You're driving " + overSpeed + " mph over the limit. Slow down!" : " ";

        System.out.println(output);
    }
}

/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */