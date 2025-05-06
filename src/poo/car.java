package poo;

public class car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = true;

    String getCarModel() {
        return model;
    }

    void brake() {
        System.out.println("You brake the " + model);
    }
}
