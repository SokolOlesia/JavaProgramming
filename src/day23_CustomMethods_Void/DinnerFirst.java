package day23_CustomMethods_Void;

public class DinnerFirst {
    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddFrom1To100(int num1, int num2) {
        for (int i = num1; i < num2; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------");
    }

    //2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenFrom1To100(int num1, int num2) {
        for (int i = num1; i <= num2; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------");
    }

    //3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleToAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy!");
        }
        System.out.println("------------------------");
    }

    //4. create a method that can check if a person is eligible to vote
    //			Ex:
    //				eligibleToVote(19, "USA");
    //
    //			output:
    //				You are not eligible to vote!
    public static void eligibleToVote(int age, String country) {
        if (age >= 18 && country.equalsIgnoreCase("USA")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
        System.out.println("------------------------");
    }

    //5. create a method that can calculate the grade of the student based on the score
    public static void grades(int score) {

        char value;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        boolean c = !a && !b && score >= 79;
        boolean d = !a && !b && !c && score >= 69;
        boolean e = !a && !b && !c && !d;


        if (a) {
            //System.out.println("Exellent"); //A
            value = 'A';
        } else if (b) {
            //System.out.println("Great");//B
            value = 'B';
        } else if (c) {
            //System.out.println("Good");//C
            value = 'C';
        } else if (d) {
            //System.out.println("Passed");
            value = 'D';
        } else {
            //System.out.println("Failed");
            value = 'F';
        }
        System.out.println(value);
        System.out.println("------------------------");
    }

    //7. create a method that can calculate the area of a square
    public static void Square(int side) {
        int area = side * side;
        System.out.println(area);
        System.out.println("------------------------");
    }

    //9. create a method that can convert dollar to euro
    public static void dollarToEuro(double dollar) {
        double euro = dollar * 0.89;
        System.out.println(dollar + " dollars is " + euro + " euro");
        System.out.println("------------------------");
    }

    //13. create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " ");
        }
        System.out.println("------------------------");
    }

    //14. create a method named printEachElement that can print each elements of an integer array
    public static void printEachElement(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println("------------------------");
    }

    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void Calculator(int n1, int n2, char mathOperator) {
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
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        oddFrom1To100(1, 100);
        evenFrom1To100(2, 100);
        eligibleToAlcohol(25);
        eligibleToVote(19, "Usa");
        grades(56);
        Square(10);
        dollarToEuro(15);
        printEachChar("Mia");
        printEachElement(new int[]{1, 2, 3, 4, 5});
        Calculator(3, 6, '*');
    }
}


/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space
2. create a method that can print even numbers between 1~100 in a same line saperated by space
3. create a method that can check if a person is eligible to buy alcohol
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
5. create a method that can calculate the grade of the student based on the score
6. create a method that can calculate the area of a circle
7. create a method that can calculate the area of a square
9. create a method that can convert dollar to euro
10. create a method that can can convert dollar to lira
11. create a method that can convert kg to lb
12. create a method that can if the given integer is positive, negative or zero

13. create a method named printEachChar that can print each characters of a string
14. create a method named printEachElement that can print each elements of an integer array
15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram


 */