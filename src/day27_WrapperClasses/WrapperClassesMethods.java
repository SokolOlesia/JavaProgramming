package day27_WrapperClasses;

public class WrapperClassesMethods {

    public static void main(String[] args) {
        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num + 1);
        System.out.println(str + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        String s1 = "true";

        boolean s2 = Boolean.parseBoolean(s1);
        System.out.println(s2);

        String n3= "123";
        Integer x = Integer.valueOf(n3); // Integer
        System.out.println("x = " + x);
        int y = Integer.valueOf(n3);

        String s3 = "1.5";
        double z = Double.valueOf(s3);

        //isDigit()
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        boolean r3 = Character.isLetter(ch1);
        System.out.println(r2);
        System.out.println(r3);
        boolean r4 = Character.isLetterOrDigit(ch1);
        System.out.println("r4 = " + r4);
        boolean r5 =  Character.isUpperCase(ch1);
        System.out.println("-----------------");
        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }

        }
        System.out.println("sum = " + sum);

    }
}
