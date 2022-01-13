package day08_IfStatement;

public class SingleIfStatement {

    public static void main(String[] args) {

        int num = 301;
        boolean evenNumber = num % 2 == 0;
        boolean oddNumber = ! evenNumber;
        if (evenNumber) {
            System.out.println("Even Number");


        }
        if(oddNumber){
            System.out.println("Odd number");
        }
    }
}
