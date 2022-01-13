package day24_CustomMethods_Return;

public class Return_vs_EitMethod {
    public static void main(String[] args) {
        nameOfMonth(50);

        System.out.println("Hello World");
    }


    public static void nameOfMonth(int number){  // 95

        if(number < 1 || number > 12){
            System.out.println("Invalid");
            //return; // exits nameOfMonth method, remaining code fragment of the method never gets executed
            System.exit(1); // whole program wii be terminated
        }


        String name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);

    }






}
