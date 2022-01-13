package day16_LoopForPracticeDay;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {


        String input = new Scanner(System.in).next();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            String ch = "" + input.charAt(i);
            //boolean same = input.indexOf(i) == input.lastIndexOf(i);
            //System.out.println(same);
            if(input.indexOf(ch) == input.lastIndexOf(ch)){// if the first and last index of numbers of the characters are same - true

                result += ch;
            }
        }
        System.out.println("result = " + result);
    }

}

/*
2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */