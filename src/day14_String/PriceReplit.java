package day14_String;

import java.util.Hashtable;
import java.util.Scanner;

class PriceReplit {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();

        int giftCardValue = 100;

        Hashtable<String, Integer> price = new Hashtable<String, Integer>();
        price.put("Blanket", 60);
        price.put("Charger", 15);
        price.put("Hat", 25);
        price.put("Headphones", 30);
        price.put("Laptop", 200);
        price.put("Pants", 50);
        price.put("Pillow", 40);
        price.put("Smartphone", 1000);
        price.put("Socks", 5);
        price.put("Usb Cable", 10);

        if (price.containsKey(item)) {
            int balance = giftCardValue - price.get(item);
            String output = balance > 0 ? "Thank you for your purchase! \nYour current balance is: "
                    + (giftCardValue - price.get(item)) + "$" : "Sorry, not enough funds on your gift card!";
            System.out.println(output);
        }
        else System.out.println("Invalid item!");

        input.close();
    }
}