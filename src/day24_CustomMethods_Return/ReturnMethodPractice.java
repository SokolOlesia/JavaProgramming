package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        //find the max number between 100 & 200
        int maxNumber = max(100, 200);
        //multiply the max number by 2
        maxNumber *= 2;
        System.out.println(maxNumber);

    }

    public static int max(int num1, int num2) {
        int result = 0;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }



}
