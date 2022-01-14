package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square1 = new Square(10);
        System.out.println(square1);
        square1.setSide(20);
        System.out.println(square1);

        System.out.println("--------------");
        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());


    }
}
