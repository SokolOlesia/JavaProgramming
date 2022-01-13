package day37_Inheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense() {
        System.out.println(brand + " " + model +  " is self defensing");
    }
}

/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */