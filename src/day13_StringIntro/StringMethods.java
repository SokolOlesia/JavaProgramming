package day13_StringIntro;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";

        char thirdCh = word.charAt(3);

        System.out.println(thirdCh);
       // char tenthCh = word.charAt(9);

        //System.out.println("tenthCh = " + tenthCh);

        System.out.println("---------------");

        String s1 = "Batch 25 is the best batch!";

        int lengthOfs1 = s1.length();

        System.out.println("lengthOfs1 = " + lengthOfs1);

        char lastChar = s1.charAt(lengthOfs1 - 1); // last index number or s1.charAt( s1.length() - 1)

        System.out.println("lastChar = " + lastChar);

        String strip = "wooden spoon";

        strip = strip.toUpperCase();

        System.out.println("stripToUp = " + strip);

        String s = "JAVA";

        s = s.toLowerCase();
        System.out.println("s = " + s);


    }
}
