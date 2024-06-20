package oop;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.display();

//        System.out.println(car1.name());

        String name = car1.name();
        System.out.println(name);

        car1.displayProperty("Truck");

        System.out.println(car1.nameProperty("Truck"));
    }
}
