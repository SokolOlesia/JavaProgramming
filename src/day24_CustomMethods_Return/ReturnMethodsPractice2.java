package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {


    public static String grades(int score) {
        String value;

        if (score < 0 || score > 100) {
            value = "Invalid";
        } else {
            value = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        return value;
    }

    public static void main(String[] args) {
        String str = grades(50);

        if (str.equals("A")) {
            System.out.println("Exellent");
        } else if (str.equals("B")) {
            System.out.println("Great");
        } else if (str.equals("C")) {
            System.out.println("Good");
        } else if (str.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Try again");
        }

    }


}
