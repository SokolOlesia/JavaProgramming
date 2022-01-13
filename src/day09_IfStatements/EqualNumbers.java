package day09_IfStatements;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter number #1:");
        int n1 = numbers.nextInt();

        System.out.println("Enter number #2:");
        int n2 = numbers.nextInt();

        System.out.println("Enter number #3:");
        int n3 = numbers.nextInt();

        boolean allEqual = (n1 == n2) && (n2 == n3) && (n1 == n3);
        boolean n1andn2Equal = (n1 == n2) && !(n2 == n3) && !(n1 == n3);
        boolean n2andn3Equal = !(n1 == n2) && (n2 == n3) && !(n1 == n3);
        boolean n3andn1Equal = !(n1 == n2) && !(n2 == n3) && (n1 == n3);


        String equalNum = allEqual ? "All equal" :
                n1andn2Equal ? "n1&n2 are equal" :
                        n2andn3Equal ? "n2&n3 are equal" :
                                n3andn1Equal ? "n3&n1 are equal" : "none of them are equal";

        System.out.println(equalNum);
    }
}
/*
6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */