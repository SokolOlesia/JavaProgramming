package day37_Inheritance.PhoneTask;

public class iPhone extends Phone {
    public iPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model +  " is having a Face Time with phone number: " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println(brand + " " + model +  " is having a Face Time with email: " + email);
    }

}

/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */