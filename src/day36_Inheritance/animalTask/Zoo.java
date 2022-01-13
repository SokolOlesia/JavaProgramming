package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "Black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.barking();
        //dog.scratch();

        Cat cat = new Cat();
        cat.setInfo("Loy", "British", 'M', 3, "Small", "Gold");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
    }
}
