package day17_WhileLoop;

import java.util.Scanner;

public class twoNumAndOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter your math operator:");
        char ch = scan.next().charAt(0);

        int result = 0;
        while (!(ch == '*' || ch == '/' || ch == '+' || ch == '-')) { //не пропускает нас дальше по программе пока мы не введем валидный оператор
            System.err.println("Enter valid math operator:");
            ch = scan.next().charAt(0);
        }
        switch (ch) {
            case '*':
               result = num1 * num2;
               break;
            case '/':
                result = num1 / num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        System.out.println("result = " + result);

    }
}

/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */