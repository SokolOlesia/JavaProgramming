package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "sokol@me.com";
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);

        System.out.println("--------------");
        String str1 = "Java is fun, Java is cool";
        int indexOfLastJ = str1.lastIndexOf("J");

        String strFun = str1.substring(0, indexOfLastJ - 2);
        System.out.println("strFun = " + strFun);

        String str1Cool = str1.substring(indexOfLastJ);
        System.out.println("str1Cool = " + str1Cool);

    }
}
