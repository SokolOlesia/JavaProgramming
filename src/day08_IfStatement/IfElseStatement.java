package day08_IfStatement;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int score = 60;
      //1
        if (score >= 60) { // simple if statement
            System.out.println("Passed!");
        }

        //2
        if (score >= 60) { // if else statement
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
        //3
        if (score >= 60) { // if else statement
            System.out.println("Passed!");
        } else if (score >=50) {
            System.out.println("Ok!");
        } else {
            System.out.println("Failed!");
        }
        //4 Nested If : 1. from 0 to 100; >= 60 -- passed; >= 50 -- ok; <50 -- failed; -5, 1000 ---- invalid
        if(score >= 0 && score <= 100) {

        } else {
            System.out.println("Invalid");
        }

        int check = 132;
        String str = "";

        if(check%2 == 0){
            str += check;
            System.out.println(str);
        }






    }
}
