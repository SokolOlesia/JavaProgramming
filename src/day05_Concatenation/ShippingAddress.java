package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Glasshouse";
        int buildingNumber = 160;
        String streetName = "E Station Square Dr";
        String city = "Pittsburgh";
        String state = "PA";
        int zipCode = 15219;

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + ", " + zipCode);
    }
}
