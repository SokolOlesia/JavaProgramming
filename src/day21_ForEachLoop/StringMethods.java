package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));


        System.out.println("-------------------------------------");

        String email = "WoodenSpoon@cydeo.com";
        String[] words2 = email.split("@");
        System.out.println(Arrays.toString(words2));
        System.out.println(words2[1]);

        System.out.println("-------------------------------------");

        String sentence2 = "The QR code makes checking in for your appointment quick and easy. If you do not have your Care Pass QR code, practice social distancing. The clinic until 15 minutes prior to your appointment.\n" +
                "Do not bring a companion unless you require physical assistance. Companions area to promote everyone’s safety.";
        String[] dotSence = sentence2.split("\\. ");
        System.out.println(Arrays.toString(dotSence));

    }
}
