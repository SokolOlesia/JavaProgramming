package day15_ForLoops;

import java.util.Scanner;

public class strartwithX {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();
word = word.replace("x", "a").replace("X", "a");
        System.out.println("word = " + word);
        System.out.println("----------");

        String firstName =  "cYDeo",
                lastNName = "sChool";
        firstName = ("" + firstName.charAt(0)) .toUpperCase() + firstName.substring(1).toLowerCase();
        //                         "c" ---->     "C"          +  "YDeo" ---------->  "ydeo"     === Cydeo
    }
}
