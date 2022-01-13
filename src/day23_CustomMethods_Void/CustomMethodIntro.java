package day23_CustomMethods_Void;

public class CustomMethodIntro {
    public static void greeting(){
        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
    }

    public static void main(String[] args) {
        System.out.println("Test Started");//1
        greeting();//2
        greeting();//3

        System.out.println("Test Complited");//4
    }
}
