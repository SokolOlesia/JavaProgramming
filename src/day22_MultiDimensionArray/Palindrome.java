package day22_MultiDimensionArray;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        boolean palindrome = word.equalsIgnoreCase(reversed);
        System.out.println(palindrome);
    }
}
