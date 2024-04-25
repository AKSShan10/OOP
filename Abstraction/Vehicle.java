package Abstraction;

public abstract class Vehicle {
    // Abstract classes can have constructors
    public Vehicle() {
        System.out.println("Constructor of Vehicle class");
    }

    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate(int speed);
    abstract void brake();

    // We can use traditional methods & attributes in an abstract class
    public void display() {
        System.out.println("This is printing from an abstract class");
        System.out.println(note);
    }

    String note = "An abstract class can also contain non-abstract methods and variables";
}
