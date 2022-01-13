package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    //create a class that can check if number is odd or even
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


    // create a function csn display the age of the person
    public static void ageOfPerson(int yearOfBirth) {
        int age = 2021 - yearOfBirth;
        System.out.println("age = " + age);
    }

    public static void circle(double radius) {
        double pi = 3.14;
        double area = pi * (radius * radius);
        double perimeter = 2 * pi * radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }

    //create a function that can print all the numbers between two int
    public static void allNumbers(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        ageOfPerson(1996);
        circle(5);
        allNumbers(10, 50);
    }
}
