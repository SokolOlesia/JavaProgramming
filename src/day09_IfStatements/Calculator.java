package day09_IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n1 = calc.nextDouble();

        System.out.println("Enter second number:");
        double n2 = calc.nextDouble();

        System.out.println("Enter math operator:");
        char mathOperator = calc.next().charAt(0);

        double result = 0;

        if (mathOperator == '+') {
            result = n1 + n2;

        } else if (mathOperator == '-') {
            result = n1 - n2;

        } else if (mathOperator == '*') {
            result = n1 * n2;

        } else if (mathOperator == '/'){
            result = n1/n2;

        } else {
            System.err.println("Invalid operator");
            System.exit(0);
        }

        System.out.println(result);

    }
}
/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable
named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */