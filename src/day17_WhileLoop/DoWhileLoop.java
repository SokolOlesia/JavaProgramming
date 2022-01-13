package day17_WhileLoop;

public class DoWhileLoop {

    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden spoon - - for loop");

        }
        System.out.println("__________________________");

        while(a){
            System.out.println("Wooden Spoon - - while loop");
        }

        System.out.println("__________________________");

        do{
            System.out.println("Wooden spoon - do while loop");
        } while (a);
    }
}
