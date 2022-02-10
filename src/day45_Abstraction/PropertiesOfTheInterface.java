package day45_Abstraction;

public interface PropertiesOfTheInterface {

    int a = 100; //static & final by default
    static int b = 200; // final by default

//    public PropertiesOfTheInterface(int a) {
//        this.a = a;
//    }
//    static {
//        b = 100;
//    }
//    public void method1(){
//        System.out.println("Instance method");
//    }
    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();

    public default void method4(){
        System.out.println("Default method");
    }
    void drink();

    default void method(){
        System.out.println("Default method");
    }
}
