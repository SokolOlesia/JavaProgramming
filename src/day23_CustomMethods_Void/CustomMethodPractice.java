package day23_CustomMethods_Void;

public class CustomMethodPractice {

    // create a function that can print word 5 times
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }

    // create a function that can print word 5 times
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloCydeo");
        }
    }

    public static void evenNumbers10Times() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers10Times();
    }
}
