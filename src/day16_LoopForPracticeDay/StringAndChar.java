package day16_LoopForPracticeDay;


import java.util.Scanner;

public class StringAndChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string: ");
        String str = input.next();

        System.out.println("Enter a char:");
        String ch1 = input.next();

        int length = str.length();
        String result = "";

        for (int i = 0; i <= length - 1; i++) {// i: index number of str (starting from 0 )
            String ch = "" + str.charAt(i);// ch: each character of str

            if (ch.equalsIgnoreCase(ch1)) {
                result += ch;
            }
        }
        System.out.println(result.length());
    }
}

/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */