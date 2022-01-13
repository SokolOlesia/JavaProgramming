package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str1 = str.replace("Java", "Python");
        System.out.println("str1 = " + str1);

        String email = "JhonSmith@yahoo.com";
        System.out.println("email = " + email);
        String gmailEmail = email.replace("yahoo", "gmail");
        System.out.println("gmailEmail = " + gmailEmail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        System.out.println("sentence = " + sentence);
        String sentence1 = sentence.replace( "Python", "" ).replace("   ", " ");
        System.out.println("sentence1 = " + sentence1);
       // sentence1 = sentence1.replace("  ", " ");
       // System.out.println("sentence1 = " + sentence1);

        String s = "Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        System.out.println(s2);

        System.out.println("-----------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);



    }
}
