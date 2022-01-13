package day15_ForLoops;

import java.util.Locale;

public class StringMethods1 {
    public static void main(String[] args) {
        //Empty or not?
        String str = "";
        boolean r = str.isEmpty(); // str is empty or not? yes, it's true, without spaces and false if it have spaces
        System.out.println("r = " + r);

        System.out.println("-----------------");

        // Blank (with spaces) or not?
        String str2 = " ";
        boolean r2 = str2.isBlank(); // true, because we dont take into account a spaces
        System.out.println("r2 = " + r2);
        System.out.println("-----------------");

        //equalsIgnoreCase()
        String str3 = "CYDEO";
        String str4 = "cydeo";
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equalsIgnoreCase(str4)); // true
        System.out.println("-----------------");

        //contains()
        String str5 = "My favorite programming language is Java";
        System.out.println(str5.contains("C#")); //false
        boolean containsJava = str5.contains("Java");
        System.out.println("containsJava = " + containsJava);//true
        boolean hasJava = str5.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava); // true
        boolean r3 = str5.toLowerCase().contains("java") || str5.toLowerCase().contains("JaVa"); //true
        System.out.println("r3 = " + r3);

        System.out.println("-----------------");

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains(input2));//true
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toLowerCase().contains("JAVA"));// trues

        System.out.println("-----------------");
        //startWith()
        String str6 = "Java loVers";
        boolean start = str6.startsWith("Ja");
        System.out.println(start);
        boolean stratLower = str6.toLowerCase().startsWith("j");
        System.out.println("stratLower = " + stratLower);//true
        boolean ending = str6.toLowerCase().endsWith("lovers");
        System.out.println(ending); //true

    }
}
