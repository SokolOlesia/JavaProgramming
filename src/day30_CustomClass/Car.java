package day30_CustomClass;

public class Car {
    public String brand;// "Toyota"
    public String model;
    public String color;
    public int year; // 23
    public double price;// 23000.00


    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){

        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }


    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }


    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
