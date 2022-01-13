package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {
    public static int publicData = 100;
    static int defaultData = 200; // access modifier: default
    private static int privateData = 300;


    public static void method1() {
        System.out.println("Method 1");
    }
    static void method2() {
        System.out.println("Method 2");
    }
    private static void method3() {
        System.out.println("Method 3");
    }
    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }
}
