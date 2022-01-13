package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "      batch 25         ";

        //TRIM METHOD
        str1 = str1.trim();
        System.out.println(str1);
        System.out.println("---------------------");

        //LAST INDEX OF
        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java programming Language";

        int n3 = str3.indexOf("amm");
        System.out.println("n3 = " + n3);
        
        int n4 = str3.indexOf("gu");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("---------------");

        String str4 = "Java Nova Cava Wawa orange";

        int firstA = str4.indexOf("a");
        int lastA = str4.lastIndexOf("a");
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);

        int secondA = str4.lastIndexOf("a ");// wawA
        System.out.println("secondA = " + secondA);

        int thirdA = str4.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int forthA = str4.indexOf("ava W");
        //int forthA = str4.lastIndexOf("av");
        int forthA = str4.indexOf("Ca") + 1;// index of C + 1 = a;
        System.out.println("forthA = " + forthA);
        
        int fifthA = str4.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixthA = str4.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);



    }
}
