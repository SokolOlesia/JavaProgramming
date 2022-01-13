package day07_Operatos;

import javax.lang.model.SourceVersion;

public class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Assignment operator: = (not equals)");
        //assignment operator: = (not equals)

        int num1 = 100;
        System.out.println("num1 = " + num1); //100

        num1 = 200;
        System.out.println("num1 = " + num1); //200

        String word = "Java Programming";
        System.out.println("word = " + word); //Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon

        word = "CYDEO";
        System.out.println("word = " + word); //CYDEO

        System.out.println("----------------------------------\nAddition assignment operator: +=");
        //Addition assignment operator: +=

        int num2 = 100;
        System.out.println("num2 = " + num2); // 100

        System.out.println(num2 + 200); //300

        num2 += 200; //num2 = num2 + 200;

        System.out.println("num2 = " + num2); //300

        word = "Wooden";
        System.out.println("word = " + word); //Wooden

        word += " Spoon";

        System.out.println("word = " + word);//Wooden Spoon

        double num3 = 2.5;
        System.out.println("num3 = " + num3); //2.5

        num3 += 5.5;
        System.out.println("num3 = " + num3); // 8.0


        System.out.println("----------------------------------\nSubtraction assignment operator: +=");
        //Subtraction assignment operator: +=
        int num4 = 1000;
        System.out.println("num4 = " + num4); //1000

        num4 -= 456;

        System.out.println("num4 = " + num4);// 544

        System.out.println("----------------------------------\nMultiplication assignment operator: *=");

        int num5 = 10;
        System.out.println("num5 = " + num5); // 10

        num5 *= 5;
        System.out.println("num5 = " + num5); //50

        System.out.println("----------------------------------\nDivision assignment operator: /=");

        int num6 = 555;
        System.out.println("num6 = " + num6);// 555

        num6 /= 111;
        System.out.println("num6 = " + num6);// 5

        System.out.println("----------------------------------\nRemainder assignment operator: %=");

        int num7 = 10;
        System.out.println("num7 = " + num7); //10

        num7 %= 3;
        System.out.println("num7 = " + num7);//1




    }
}
