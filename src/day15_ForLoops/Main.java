package day15_ForLoops;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        String result = "";
        String lengthLonger4 = word.substring( ( (  (word.length())/2) - 1), (((word.length() ) / 2 ) + 1) );
        String twoCharTwice = word.repeat(2);

        String lengthLonger3 = "" + word.charAt( ( ( (word.length())/2)) );
        String threeChar = word.repeat(3);

        if (word.length() % 2 == 0){
            result = (word.length() >= 4) ? lengthLonger4 : twoCharTwice;
        } else {
            result = (word.length() >= 3) ? lengthLonger3 : threeChar;
        }
        System.out.println(result);
    }
}
