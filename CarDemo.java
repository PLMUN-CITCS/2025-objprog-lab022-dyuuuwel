// Car class representing a blueprint for creating Car objects
class Car {
    // Attributes (data fields)
    String make;
    String model;
    int year;

    // Constructor to initialize attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class containing the main method
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object and initializing attributes using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Calling the method to display car details
        myCar.displayInfo();
    }
}
