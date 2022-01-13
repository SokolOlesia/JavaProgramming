package day07_Operatos;

public class RelationOperators {
    public static void main(String[] args) {
        System.out.println("----------------------------------\nRelational Operators: >, >=, <, <=");

        boolean result1 = 200 > 48;
        System.out.println("result1 = " + result1);// true

        boolean result2 = 300 >= 300;
        System.out.println("result2 = " + result2);// true

        boolean result3 = 300 >= 500;
        System.out.println("result3 = " + result3);//false

        boolean result4 =  1 < 2;
        System.out.println("result4 = " + result4);// true

        boolean result5 = 5 == 5;
        System.out.println("result5 = " + result5);//true

        boolean result6 = 2 != 2;
        System.out.println("result6 = " + result6);

    }
}
