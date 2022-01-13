package day07_Operatos;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(--num2);
        System.out.println(num2--);

        System.out.println("--------------------------------");
        int a = 5;
        ++a; // pre increment : increases the value by 1 right away, immidiately

        System.out.println(a);
        --a; // pre decrement : decreases the value by 1
        System.out.println(a);
        System.out.println("--------------------------------");

        int b = 5;

        System.out.println(b++); /*
        post increment : when we use post increment post the digital before increase,
        first passes the current value, then increase the value by 1*/

        System.out.println(b); // 6


    }
}
