package day14_String;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();

        int GiftCard = 100;

        int price = 0;

        boolean validItem = item.equals("Blanket") || item.equals("Hat") || item.equals("Headphones") || item.equals("Laptop") || item.equals("Pants") ||item.equals("Pillow") || item.equals("Smartphone") || item.equals("Charger")|| item.equals("Socks") || item.equals("USB cable");

        int blanket = 60;
        int charger = 15;
        int hat = 25;
        int headfhones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;

        String result = "";

        if (validItem) {
            switch (item){
                case "Blanket":
                    result = "Thank you for your purchase! \nYour current balance is: " + (GiftCard - blanket) + "$";
                    break;
                case "Charger":
                    result = "Thank you for your purchase!\nYour current balance is: " + (GiftCard - charger) + "$";
                    break;
                case "Hat":
                    result = "Thank you for your purchase! \nYour current balance is: " + (GiftCard -hat) + "$";
                    break;
                case "Headphones":
                    result = "Thank you for your purchase! \nYour current balance is: " + (GiftCard - headfhones) + "$";
                    break;
                case "Pants":
                    result = "Thank you for your purchase! \nYour current balance is: " + (GiftCard - pants) + "$";
                    break;
                case "Pillow":
                    result = "Thank you for your purchase! \nYour current balance is: " + (GiftCard - pillow) + "$";
                    break;
                case "Socks":
                    result = "Thank you for your purchase!\nYour current balance is: " + (GiftCard - socks) + "$";
                    break;
                case "USB cable":
                    result = "Thank you for your purchase!\nYour current balance is: " + (GiftCard - usbCable) + "$";
                    break;
                case "Laptop":
                case "Smartphone":
                    result = "Sorry, not enough funds on your gift card!";
                    break;
            }
        }else{
            result = "Invalid item!";
        }
        System.out.println(result);

        input.close();
    }
}
