// Base class
class Vehicle {

    // Constructor
    Vehicle() {
        System.out.println("Vehicle is moving");
    }
}

// Derived class
class Car extends Vehicle {

    // Constructor
    Car() {
        System.out.println("Car is moving");
    }
}

// Main class
public class Mainn {
    public static void main(String[] args) {

        Vehicle v;

        // Parent reference holding Vehicle object
        v = new Vehicle();

        // Parent reference holding Car object
        v = new Car();
    }
}