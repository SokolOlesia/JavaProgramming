package day13_StringIntro;

import java.lang.String;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1.equals(str2));

        System.out.println("------------------------");
        String str3 = "Java";
        String str4 = new String("java");
        System.out.println(str3.equals(str4));

        String firstName = "Wooden";
        String lastName = "Spoon";

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));
        System.out.println("------------------------");

        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();;
        String last = scan.nextLine();

        char f = first.charAt(0);
        char l = last.charAt(0);

        System.out.println(f + "." + l);
        scan.close();

    }
}
