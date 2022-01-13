package day09_IfStatements;

import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a number is:");
        int a = sc.nextInt();
        System.out.println("b number is:");
        int b = sc.nextInt();
        System.out.println("c number is:");
        int c = sc.nextInt();

        System.out.println("Median number is: " + findMedian(a, b, c));
    }

    static int findMedian(int a, int b, int c) {

        if ((a <= b) && (b <= c))
            return b;
        else if ((a <= c) && (c <= b))
            return findMedian(a, c, b);
        else if ((b <= a) && (a <= c))
            return findMedian(b, a, c);
        else if ((b <= c) && (c <= a))
            return findMedian(b, c, a);
        else if ((c <= a) && (a <= b))
            return findMedian(c, a, b);
        else
            return findMedian(c, b, a);
    }
}
