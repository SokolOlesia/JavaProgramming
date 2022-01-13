package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100; // -128 ---> 127
        short b = a; //присваеваем переменной b (т.к. она стоит в левой части) значение переменной а
        // short b = short a;
        //short b = (short) a;

        int c = b; //implicit casting
        //int c = (int) b;

        long d = c;
        //      (long)c;

        float e = d;

        double f = e;

        System.out.println("----------");
       //inplicit
//            byte a = 100; // -128 ---> 127
//            short b = a; //присваеваем переменной b (т.к. она стоит в левой части) значение переменной а
//            // short b = short a;
//            //short b = (short) a;

        //explicit casting
        short x = 115; //-33000 ....
        byte y = (byte) x; //присваеваем перемнной y значение переменной x
        //byte y = short x; // ругается и не знает че ему делать
        // byte y = (byte) x; // мы явно говорим что мы хотим проебать часть данных
        System.out.println(x + ":" + y);


        long j = 1000000;
        short k = (short) j;

        System.out.println(j + ":" + k);


        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + ":" + s1);
    }
}
