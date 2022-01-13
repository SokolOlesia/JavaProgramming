package day15_ForLoops;

public class ForLoopsPractice {
    public static void main(String[] args) {
        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }
        System.out.println("------------------");
        //print all the even numbers between 1~55

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = 2; i <= 54; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        for (char j = 'Z'; j >= 'A'; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        for (char j = 'z'; j >= 'a'; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();
/*
1. print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */
        for (char star = 1; star <= 8; star++) {
            System.out.println("* * * * * * *");
        }
        /*
        2. Write a method which prints out the numbers from 1 to 100 but
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
        for numbers which are a multiple of 3, print "FIN" instead of the number and
        for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA ");
            }else if(i%3==0){
                System.out.print("FIN ");
            }else if(i%5==0){
                System.out.print("RA ");
            } else{
                System.out.print(i + " ");
            }
        }


    }
}