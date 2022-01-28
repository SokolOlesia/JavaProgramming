package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {
    public static void method1() throws FileNotFoundException { // throws not fixing a problem
        new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {// now we can handle it
        method1();
    }
    public static void method3() throws FileNotFoundException, InterruptedException {
        method2();
        Thread.sleep(1000);
    }
    public static void method4() throws FileNotFoundException, InterruptedException {
        method3();

    }
}
