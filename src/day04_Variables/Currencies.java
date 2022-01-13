package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 100;

        double lira = dollar * 9.53;
        double euro = dollar * 1.16;
        double jpi = dollar * 114.14;
        double peso = dollar * 20.85;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("jpi = " + jpi);
        System.out.println("peso = " + peso);
    }
}
