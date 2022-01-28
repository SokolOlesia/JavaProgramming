package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args){
        System.out.println("Test started");
        System.out.println(8/0); //unchecked exceptions we can't use throws keyword
        System.out.println("Test completed");
    }
}

/*
Try & catch block: big size and repeat on all the exceptions. We can use it with unchecked & checked exceptions
Throws: small size, but if we inheritance this method we still use throws keyword with methods. and we don't need additional code fragments only method signature will change
 */