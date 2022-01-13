package day17_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Will you marry me?");

        String a = scan.next().toLowerCase(); // maybe
//                  false        ||   false    ---- false
//                  true         ||   false    ---- true
        while( !( a.equals("yes")||a.equals("no") ) ){ //true //false
            System.out.println("Invalid answer, please re-enter");
            a = scan.next().toLowerCase();// yes
        }
        // если мы напсиали верный овтет, то мы вышли из цикла While.
        //if statement стоит после while и будет выполнен только если мы выйдем из цикла while


        if(a.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
