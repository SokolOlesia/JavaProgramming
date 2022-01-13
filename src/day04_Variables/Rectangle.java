package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        double length = 15.6;
        int width = 5;

        int area = (int) (length * width);
        int perimetr = (int) (length + width) *2;

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimetr = " + perimetr);
    }
}
