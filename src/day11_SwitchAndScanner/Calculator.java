package day11_SwitchAndScanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5;
        double n2 = 10.5;

        char operator = '?';
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        double result = 0;

        if (valid) { // OP: +,-, *, /

            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1-n2;
                    break;
                case '*':
                    result = n1*n2;
                    break;
                case '/':
                    result = n1/n2;
                    break;
            }

        } else {
            System.err.println("Invalid operator: " + operator);
        }
        System.out.println(result);
    }
}
