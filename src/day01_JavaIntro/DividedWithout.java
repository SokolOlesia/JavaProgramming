package day01_JavaIntro;

public class DividedWithout {
    public static void main(String[] args) {
        divideWithout(15,0);
    }
    public static void divideWithout(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count);
    }
}
