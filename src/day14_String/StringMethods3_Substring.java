package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //substring (beginnig index, ending index)

        String word = "Cydeo School";

        String brand = word.substring(0, 4);
        System.out.println("brand = " + brand);

        String str1 = word.substring(0 , word.indexOf("S") + 1);
        System.out.println(str1);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));
        System.out.println("s1 = " + s1);

        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);
        System.out.println("s3 = " + s3);

    }
}
