package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("----------------Push up started---------------");


        for (int i = 1; i <= 30 ; i++) {
            System.out.print("\rPush up " + i);
            sleep(1.5);
        }


        System.out.println("\n----------------Push up completed---------------");


    }
    public static void sleep(double seconds) {

        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*
1. Do 30 push-ups and try pausing 1.5 seconds in each


        2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */