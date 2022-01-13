package day16_LoopForPracticeDay;

import java.util.Scanner;

public class DuplicatedChar {
    public static void main(String[] args) {
        String scan = new Scanner(System.in).next(); // "aaabbbcc" ---> "abc"
        String result = "";

        for (int i = 0; i < scan.length(); i++) { // i:
            char ch = scan.charAt(i); // represent each of Char of scan
            if (!result.contains(ch + "")) {
                result += ch;
            }

        }

        System.out.println("result = " + result);
    }
}

/*
1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

    2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */