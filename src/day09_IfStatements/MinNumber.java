package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1IsMin) {
            System.out.println(n1 + " is the minimum number");
        } else if (n2IsMin) {
            System.out.println(n2 + " is the minimum number");
        } else if (equal) {
            System.out.println(n1 + " and " + n2 + " is the equals");
        }
    }
}
