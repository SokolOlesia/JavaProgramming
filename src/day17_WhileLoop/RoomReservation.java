package day17_WhileLoop;

import java.util.Hashtable;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? (yes/no)");
        String reserveRoom = scan.next();

        Hashtable<String, Integer> price = new Hashtable<String, Integer>();
        price.put("King bed", 120);
        price.put("Queen bed", 100);
        price.put("Single bed", 80);

        while (!(reserveRoom.equalsIgnoreCase("no") || reserveRoom.equalsIgnoreCase("yes"))) {
            System.err.println("Please enter a valid entry.\nDo you want to reserve a room? (yes/no)");
            reserveRoom = scan.next();
        }

        if (reserveRoom.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day!");
        } else {
            System.out.println("Which type of room do you wants to reserve? (King Bed/Queen Bed/Single Bed)");
            scan.nextLine();
            String typeRoom = scan.nextLine();
            while (!(typeRoom.equalsIgnoreCase("King bed") || typeRoom.equalsIgnoreCase("Queen bed") || typeRoom.equalsIgnoreCase("Single bed"))) {
                System.err.println("Please enter a valid entry.\nWhich type of room do you wants to reserve? (King Bed/Queen Bed/Single Bed)");
                typeRoom = scan.nextLine();
            }

            if (price.containsKey(typeRoom)) {
                System.out.println("You have reserved the room: " + typeRoom + " - $" + price.get(typeRoom));
            }

        }
        scan.close();

    }
}

/*
5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */