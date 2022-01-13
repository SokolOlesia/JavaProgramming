package day08_IfStatement;

import java.sql.SQLOutput;

public class GradeReport {
    public static void main(String[] args) {
/*
        System.out.println( true == !false);//true
        System.out.println(!true != false); // false
        System.out.println(!false == true); //true

        System.out.println(!!false);//false
        System.out.println(!!!true);//false

 */

        int score = 40;
        char value;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && !a; //if score is A, but score is greater than 80
        //boolean c = score >=70 && score <= 79;
        boolean c = !a && !b && score >= 79;
        boolean d = !a && !b && !c && score >= 69;
        boolean e = !a && !b && !c && !d;


        if (a) {
            //System.out.println("Exellent"); //A
            value = 'A';
        } else if (b) {
            //System.out.println("Great");//B
            value = 'B';
        } else if (c) {
            //System.out.println("Good");//C
            value = 'C';
        } else if (d) {
            //System.out.println("Passed");
            value = 'D';
        } else {
            //System.out.println("Failed");
            value = 'F';
        }
        System.out.println(value);
        /*
        90 ~ 100 => Excellent
        80 ~ 90 => Great
        70 ~ 79 => Good
        60 ~ 69 => Passed
        0 ~ 59 => Failed


         */
    }
}
