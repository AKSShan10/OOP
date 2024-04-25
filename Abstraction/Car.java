package Abstraction;

public class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("The Car is accelerating at " + speed + " km/h");
    }

    @Override
    void brake() {
        System.out.println("Car braking");
    }

    void printMsg() {
        System.out.println("I am in Car class");
    }
}
