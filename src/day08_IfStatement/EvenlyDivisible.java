package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 101;

        boolean divisibleTwo = number % 2 == 0; // if the remainder of number divided by 2,
        boolean divisibleThree = number % 3 == 0;// if the remainder of number divided by 3
        boolean divisibleFive = number % 5 == 0;// if the remainder of number divided by 5

        System.out.println(number + " is divisible by 2: " + divisibleTwo);
        System.out.println(number + " is divisible by 3: " + divisibleThree);
        System.out.println(number + " is divisible by 5: " + divisibleFive);
    }

}
/*2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */