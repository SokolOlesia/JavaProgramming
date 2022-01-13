package day07_Operatos;

public class PracticeOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int c = a + b;
        System.out.println("c = " + c);

        double d = 5.5;
        double e = 6.5;

        double f = d + e; //12.0;
        System.out.println("f = " + f);

        double g = a + d; // 15.5
        System.out.println("g = " + g);

        double h = a / d;
        System.out.println("h = " + h);

        System.out.println((int)(10%3.0));


    }
}
