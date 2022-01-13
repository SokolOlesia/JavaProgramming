package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        String str = "Java";
        String sentence = reversed(str); //avaJ
        System.out.println(sentence);

        if (str.equalsIgnoreCase(sentence)){
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }

    public static String reversed(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }

        return reversed;
    }


}
