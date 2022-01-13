package day17_WhileLoop;

import java.util.Scanner;

public class LogInThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String u = "", p = "";
        int maxAttempts = 3; //0
        boolean isntMatching = true;

        while (isntMatching) { // true

            if (maxAttempts < 3 && maxAttempts > 0) { // false
                System.out.println("Attempts left: " + maxAttempts + "\nIncorrect username or password, please re-enter");
            } else if (maxAttempts == 0) { //true
                System.out.println("Your account is locked.");
                break;
            }

            System.out.println("Enter your username:");
            u = scan.next(); //Cydeo

            System.out.println("Enter your password:");
            p = scan.next();//Cydeo123
                              //  true            true
            isntMatching = !(u.equals("Cydeo") && p.equals("Cydeo123")); //false

            if (!isntMatching) { //true
                System.out.println("Logged in");
                break;
            }

            maxAttempts--;
        }

        scan.close();
    }
}
