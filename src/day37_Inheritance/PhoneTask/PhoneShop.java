package day37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        iPhone iPhone12 = new iPhone("12 Pro", "6.7 inches", 1000, "Black");
        System.out.println(iPhone12);
        iPhone12.text(4128920);
        iPhone12.faceTime("lesy0104@mail.ru");
    }
}
