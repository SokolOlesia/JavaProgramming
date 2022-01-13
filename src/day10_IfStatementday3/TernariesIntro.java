package day10_IfStatementday3;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        /*if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/
        String isItEven = (n%2==0) ? "Even" : "Odd";

        System.out.println("----------------------------------");
        
        int num = 100;
        String result2 = (num>0)? "Positive" : (num<0)? "Negative" : "Zero" ;
        System.out.println(result2);
    }
}
