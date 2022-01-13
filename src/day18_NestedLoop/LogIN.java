package day18_NestedLoop;

import java.util.Scanner;

public class LogIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter yor password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Lodded in");
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect user name or password");
                System.out.println("Enter your user name:");
                u = scan.next();

                System.out.println("Enter yor password:");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Lodded in");
                    break;
                }

                if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                    System.err.println("Your account is locked.");
                }
            }
        }
    }
}
